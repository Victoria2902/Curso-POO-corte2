package EjerciciosPOOCorte2.Ejercicio15;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String identificador;
    private String estado; 

    public Libro(String titulo, String autor, int anoPublicacion, String identificador) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.identificador = identificador;
        this.estado = "disponible";
    }

    
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacion() { return anoPublicacion; }
    public String getIdentificador() { return identificador; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String mostrarInfo() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + anoPublicacion + ", Estado: " + estado;
    }
}
