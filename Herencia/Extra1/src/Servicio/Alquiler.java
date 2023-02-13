package Servicio;

import Entidades.BarcoMotor;
import Entidades.Cliente;
import Entidades.Velero;
import Entidades.Yate;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {
    Cliente cliente = new Cliente();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearCliente() {
        System.out.println("Ingrese su nombre");
        cliente.setNombre(sc.next());

        System.out.println("Ingrese su documento");
        cliente.setDocumento(sc.next());

        setFechas();

        System.out.print("Seteando posicion de amarre");
        cliente.setPosicionAmarre((int) (Math.random() * 30) + 1);
        esperar3Segundos();
        System.out.println("Listo!\n");
    }

    private int diffFechas = 0;

    private void setFechas() {
        boolean fechaDevMenor;
        LocalDate fechaInicio, fechaEntrega;
        do {
            System.out.println("Fecha de inicio: (Dia/Mes/Año)");
            int dia = sc.nextInt(), mes = sc.nextInt(), anio = sc.nextInt();
            fechaInicio = LocalDate.of(anio, mes, dia);

            System.out.println("Fecha de devolucion: (Dia/Mes/Año)");
            dia = sc.nextInt();
            mes = sc.nextInt();
            anio = sc.nextInt();
            fechaEntrega = LocalDate.of(anio, mes, dia);

            diffFechas = (int) ChronoUnit.DAYS.between(fechaInicio, fechaEntrega);

            if (diffFechas < 0) {
                System.out.print("La fecha de inicio no puede ser mayor que la fecha de entrega");
                esperar3Segundos();
            }
        } while (diffFechas < 0);
        cliente.setFechaEntrega(fechaEntrega);
        cliente.setFechaInicio(fechaInicio);
    }

    public String precioAlquiler() {
        DecimalFormat dc = new DecimalFormat("#,###.##");
        return "\nPrecio total del alquiler: $" + dc.format(diffFechas * cliente.getBarco().modulo());
    }


    public void menu() {
        do {
            System.out.println("Elija un barco");
            System.out.println("1. Velero");
            System.out.println("2. Barco a motor");
            System.out.println("3. Yate de lujo");
        } while (!opciones(sc.nextInt()));

    }

    private boolean opciones(int opcion) {

        switch (opcion) {
            case 1 -> {
                System.out.println("__________Creacion De Velero__________");
                cliente.setBarco(new Velero());
                System.out.println(precioAlquiler());
                return true;
            }
            case 2 -> {
                System.out.println("__________Creacion De Barco a Motor__________");
                cliente.setBarco(new BarcoMotor());
                System.out.println(precioAlquiler());
                return true;
            }
            case 3 -> {
                System.out.println("__________Creacion De Yate__________");
                cliente.setBarco(new Yate());
                System.out.println(precioAlquiler());
                return true;
            }
            default -> {
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                esperar3Segundos();
                return false;
            }
        }
    }

    public void estipularPrecio() {

    }

    private void esperar3Segundos() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println();
        } catch (Exception e) {
        }
    }


}
