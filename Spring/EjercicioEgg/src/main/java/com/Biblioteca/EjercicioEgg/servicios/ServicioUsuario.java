package com.Biblioteca.EjercicioEgg.servicios;

import com.Biblioteca.EjercicioEgg.entidades.Usuario;
import com.Biblioteca.EjercicioEgg.enumeraciones.Rol;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.repositorios.RepositorioUsuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class ServicioUsuario implements UserDetailsService {
    @Autowired
    RepositorioUsuario repoUsuario;

    @Transactional
    public void registrarUsuario(String nombre, String email, String password, String password2) throws MiExcepcion {
        validar(nombre, email, password, password2);
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        if (nombre.contains("admin")) {
            usuario.setRol(Rol.ADMIN);
        } else {
            usuario.setRol(Rol.USER);
        }
        repoUsuario.save(usuario);
    }

    private void validar(String user, String email, String password, String password2) throws MiExcepcion {
        if (user == null || user.isEmpty()) {
            throw new MiExcepcion("Debe poner user de usuario");
        }
        if (email == null || email.isEmpty()) {
            throw new MiExcepcion("Debe poner email");
        }
        if (password == null || password.length() <= 5) {
            throw new MiExcepcion("La contraseña no puede estar vacía y debe tener mas de 5 digitos");
        }
        if (!password2.equals(password)) {
            throw new MiExcepcion("Las contraseñas no coinciden");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = repoUsuario.obtenerPorEmail(email);
        if (usuario != null) {
            List<GrantedAuthority> permisos = new ArrayList<>();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
            permisos.add(p);

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario);
            return new User(usuario.getEmail(), usuario.getPassword(), permisos);
        } else {
            return null;
        }
    }
}
