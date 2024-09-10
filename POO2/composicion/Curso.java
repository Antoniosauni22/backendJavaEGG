public class Curso {
    private String nombre;
    private char division;
    private Profesor profesor;
    
    public Curso(String nombre, char division, Profesor profesor) {
        this.nombre = nombre;
        this.division = division;
        this.profesor = profesor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getDivision() {
        return division;
    }
    public void setDivision(char division) {
        this.division = division;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    
    
}
