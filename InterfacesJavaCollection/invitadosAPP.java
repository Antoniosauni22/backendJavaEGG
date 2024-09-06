import java.util.HashSet;

public class invitadosAPP {

    public static void main(String[] args) {
        HashSet<String> nombres= new HashSet<>();
        nombres.add("Juan Jose Perez Quispe");
        nombres.add("Luis Alberto gutierrez Abisrror");
        nombres.add("Marcos Sifuentes Lopez");
        registroInvitados registro= new registroInvitados(nombres);
        registro.agregarInvitado("luchito");
        registro.mostrarInvitados();
    

    }


 
    
}
