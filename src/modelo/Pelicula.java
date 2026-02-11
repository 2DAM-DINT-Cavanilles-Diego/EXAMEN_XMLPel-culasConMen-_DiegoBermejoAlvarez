package modelo;


public class Pelicula {
    
    //Atributos
    private String titulo;
    private int duracion;
    private String trailer;
    private String genero;

    // Constructor para guardar los datos
    public Pelicula(String titulo, int duracion, String trailer, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.trailer = trailer;
        this.genero = genero;
    }

    // Getters: son necesarios para que el botón "Generar XML" pueda leer los datos
    public String getTitulo() { return titulo; }
    public int getDuracion() { return duracion; }
    public String getTrailer() { return trailer; }
    public String getGenero() { return genero; }
}
