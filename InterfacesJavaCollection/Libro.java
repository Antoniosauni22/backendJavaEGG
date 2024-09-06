public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public Libro(String titulo,String autor,int ISBN ){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
    }

    @Override
    public int hashCode() {
    // metodo sobreescrito         
       return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        // metodo sobreescrito del por defecto 
        if (this == obj)
            return true;
        if (obj == null || getClass()!=obj.getClass())
            return false;
        Libro otroLibro = (Libro) obj;
        return ISBN ==otroLibro.ISBN;

    }

    

    
}
