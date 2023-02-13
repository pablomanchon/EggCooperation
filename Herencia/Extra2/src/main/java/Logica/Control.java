package Logica;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {

    ArrayList<Edificio> edificios = new ArrayList();

    Scanner sc = new Scanner(System.in);

    public void crearEdificios() {
        for (int i = 1; i <= 2; i++) {
            EdificioDeOficinas edificio = new EdificioDeOficinas();
            System.out.println("__________Creacion del edificio N°" + i + "__________");

            System.out.print("Ancho: ");
            edificio.setAncho(sc.nextDouble());

            System.out.print("Alto: ");
            edificio.setAlto(sc.nextDouble());

            System.out.print("Largo: ");
            edificio.setLargo(sc.nextDouble());

            System.out.print("Numero de oficinas: ");
            edificio.setNumOficinas(sc.nextInt());

            System.out.print("Personas por oficina: ");
            edificio.setPersonasPorOficina(sc.nextInt());

            edificios.add(edificio);
        }
    }

    public void crearPolideprotivos() {
        for (int i = 1; i <= 2; i++) {
            Polideportivo polideportivo = new Polideportivo();
            System.out.println("__________Creacion del Polideprotivo N°" + i + "__________");

            System.out.print("Ancho: ");
            polideportivo.setAncho(sc.nextDouble());

            System.out.print("Alto: ");
            polideportivo.setAlto(sc.nextDouble());

            System.out.print("Largo: ");
            polideportivo.setLargo(sc.nextDouble());

            System.out.print("Nombre: ");
            polideportivo.setNombre(sc.next());

            System.out.print("Tipo de instalación: ");
            polideportivo.setTipoInstalacion(sc.next());

            polideportivo.setTecho(Techo(polideportivo));

            edificios.add(polideportivo);
        }
    }

    private boolean Techo(Polideportivo polideportivo) {
        System.out.print("Techo(S/N): ");
        do {
        String opcion = sc.next().toUpperCase();
            switch (opcion) {
                case "S":
                    return true;
                case "N":
                    return false;
                default:
                    System.out.println("Opcion incorrecta, vuelva a intentarlo");
            }
        } while (true);
    }

    public void aplicarMetodos(){
        Integer contadorTechados = 0, numeroEdificio = 1;
        for (Edificio aux : edificios){
            String tipoEdificio = aux.getClass().toString();
            if (tipoEdificio.contains("Edificio")){
                System.out.println("__________Edificio Nº" + (numeroEdificio++) + "__________");
                System.out.println("Superficie: " + aux.calcularSuperficie());
                System.out.println("Volumen: " + aux.calcularVolumen());
                System.out.println(((EdificioDeOficinas)aux).cantPersonas());
                System.out.println("_________________________________\n");
            }else if(tipoEdificio.contains("Polideportivo") && ((Polideportivo) aux).isTecho()){
                contadorTechados++;
            }
        }
        System.out.println("__________Polideportivos__________");
        System.out.println("Cantidad de autos Techados: " + contadorTechados);
        System.out.println("_________________________________");
    }
}
