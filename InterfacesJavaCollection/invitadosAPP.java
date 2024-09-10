import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class invitadosAPP {

    public static void main(String[] args) {

        int opc;
        registroInvitados registro=new registroInvitados();

            Scanner sc = new Scanner(System.in);
            System.out.println("|-------------------------------------------+");
            System.out.println("|--------------MENU DE OPCIONES------------|");
            System.out.println("| 1.AGREGAR INVITADOS                      |");
            System.out.println("| 2.ELIMINAR INVITADOS                     | ");
            System.out.println("| 3.MOSTRAR LA LISTA ACTUAL DE INVITADOS   | ");
            System.out.println("| 4.SALIR                                  | ");
            System.out.println("|__________________________________________|");
            System.out.println("ELIJA UNA OPCION :");

                opc = sc.nextInt();
                sc.nextLine();// estamos consumiendo el salto de linea que deja next int ; 

                switch (opc) {
                    case 1:
                        System.out.println("Ingrese nombre de invitado a agregar :");
                        String nombre=sc.nextLine();
                        break;
    
                    case 2:
                        System.out.println("Eliminar invitados ");
                        break;
                    case 3:
                        System.out.println("LISTA DE INVITADOS ACTUAL ");
                        registro.mostrarInvitados();
                        break;
                    case 4:
                        System.out.println("saliendo ");
                        break;

                    default:
                        break;
                }

               System.out.println("Final del programa ");
          
      

        /*
         * HashSet<String> nombres= new HashSet<>();
         * nombres.add("Juan Jose Perez Quispe");
         * nombres.add("Luis Alberto gutierrez Abisrror");
         * nombres.add("Marcos Sifuentes Lopez");
         * registroInvitados registro= new registroInvitados(nombres);
         * registro.agregarInvitado("luchito");
         * registro.mostrarInvitados();
         */

    }

}
