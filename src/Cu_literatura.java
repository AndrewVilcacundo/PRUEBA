public class Cu_literatura {
    //establecemos las instancias
    String nombre;
    int edad;
    String autor;
    String tipo;
    int paginas;

    //Esto es un contructor
    public Cu_literatura(String nombre, int edad, String autor, String tipo, int paginas) {
        this.nombre = nombre;
        this.edad = edad;
        this.autor = autor;
        this.tipo = tipo;
        this.paginas = paginas;
    }

    //impresion de datos
    public void mostrar2() {
        System.out.println("El nombre de la pelicula: " + nombre);
        System.out.println("El año en el que se estreno la pelicula es: " + edad);
        System.out.println("El nombre del autor es: " + autor);
        System.out.println("El tipo de literatura es: " + tipo);
        System.out.println("El numero de paginas es: " + paginas);

    }

}