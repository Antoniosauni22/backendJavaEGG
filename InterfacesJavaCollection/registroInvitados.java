import java.util.HashSet;

public class registroInvitados {
    private HashSet<String> invitados;

    // constructor con datos 
    
    
    public registroInvitados(HashSet<String> invitados) {
        this.invitados = invitados;
    }

    public registroInvitados() {
        invitados =new HashSet<>();
    }

    public void agregarInvitado(String nombre){
        this.invitados.add(nombre);

    }

    public void eliminarInvitado(String nombre){
        this.invitados.remove(nombre);

    }

    public void mostrarInvitados(){
        System.out.println("------LISTA INVITADOS AL EVENTO -----");
        for (String invitado : invitados) {
            System.out.println("     "+invitado+"   ");
            
        }

    }


    
    
}
