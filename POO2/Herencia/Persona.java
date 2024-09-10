public class Persona {

    protected String nombre;
    protected int edad;
    // atributos de tipo protected por se clase padre para que pueda ser accedida d
    // por sus clases hijas 

    //Contructor vacio
    public Persona(){

    }

    //Contructor con parametros 
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    //Metodos propios de la Super clase padre 
    public void Hablar(){
        System.out.println("La persona esta hablando ...");
    }

    public void Caminar(){
        System.out.println("La Persona esta caminando .. ");
    }

    public void Cantar(){
        System.out.println("La persona esta cantando ");
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + edad;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }


}