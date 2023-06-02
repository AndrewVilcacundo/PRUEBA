//libreria
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Establecemos un scanner
        Scanner entrada = new Scanner(System.in);
        //Ingresamos un int de opciones, ya que es un menu y se debe elegir un numero para ingresar a la literatura requerida
        int opcion;
        System.out.println("Menu de literaturas:");
        System.out.println("1) Primera literatura");
        System.out.println("2) Segunda literatura");
        System.out.println("3) Tercer literatura");
        System.out.println("4) Cuarta literatura");
        System.out.println("5) Quinta literatura");
        opcion = entrada.nextInt();

        //utilizamos el if para el menu de opciones
        //en la primera literatura se utilizo el constructor con 5 instancias
        if (opcion == 1) {
            Literaturas pr = new Literaturas("El angel caido", 2005, "Eddie Thomas", "Comedia", 270);
            //con el mostrar mandamos a imprimir todos los datos de arriba.
            pr.mostrar();
        }
        //en la segunda literatura se utilizo el get-set con 5 instancias
        if (opcion == 2) {

            Se_literatura se = new Se_literatura();
            se.setNombre("El angel caido");
            se.setEdad(2005);
            se.setAutor("Michael Sandoval");
            se.setTipo("Terror");
            se.setPaginas(150);
            //aqui se imprimi las 5 instancias
            System.out.println("El nombre de la literatura es: " + se.getNombre() + ", se estreno en el año: " + se.getEdad() + ", el autor es: " + se.getAutor() + ", el tipo es: " + se.getTipo() + ", el numero de paginas es: " + se.getPaginas());
        }

        if (opcion == 3) {
            Ter_literatura ter = new Ter_literatura("Planeta Tierra", 2010, "Steven Madisson", "Comedia", 100);
            //con el mostrar mandamos a imprimir todos los datos de arriba.
            ter.mostrar1();
        }

        if (opcion == 4) {
            Cu_literatura cu = new Cu_literatura("Carro volador", 1990, "Richard Cat", "Ficcion", 456);
            //con el mostrar mandamos a imprimir todos los datos de arriba.
            cu.mostrar2();
        }
        if (opcion == 5) {
            Qu_literatura qu = new Qu_literatura("El barco hundido", 2003, "Alberto Rodrigrez", "Comedia", 234);
            //con el mostrar mandamos a imprimir todos los datos de arriba.
            qu.mostrar3();
        }
    }
}