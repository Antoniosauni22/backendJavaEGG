public class Estudiante extends Persona {
    private String grado;

    // constructor solo para la clase hija estudiante

    public Estudiante(String grado) {
        this.grado = grado;
    }
    
    //Contructor para inicializar la clase estudiante con la super clase Persona (Super)

    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    @Override
    public void Caminar() {
       // estamos sobrescribiendo el metodo de la clase padre pero para esta clase hija 
       System.out.println("El estudiante esta caminando");
    }

    @Override
    public void Hablar() {
        // TODO Auto-generated method stub
        System.out.println("El estudiante esta hablando ");
    }

    @Override
    public void Cantar(){
        System.out.println("El estudiante esta cantando ");
    }

   

    
}
