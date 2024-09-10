import java.util.ArrayList;
import java.util.Scanner;

public class ciudadesAPP {
    public static void main(String[] args) {
        // conjunto de ciudades arrayList

        ArrayList<String> ciudades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int rpsta = 2;
        System.out.println("|------------------------------|");
        System.out.println("|--------BIENVENIDO -----------|");
        do {
            System.out.print("INGRESE NOMBRE DE LA CIUDAD:");
            String ciudad = sc.nextLine();
            ciudades.add(ciudad);
            System.out.println();
            System.out.println("¿Desea ingresa otra ciudad S/N ? \n" + //
                                "");
            System.out.print("         |1.SI| |2.NO|       ");
            System.out.print("RESPUESTA : ");        
            rpsta = sc.nextInt();
            sc.nextLine();// liberamos el salto de linea .
            System.out.print("\n");
        } while (rpsta == 1);
        // Mostramos las ciudades con un fori 
        System.out.println("*----------------------------------*");
        System.out.println("|------CIUDADES REGISTRADAS -------|");

        for (String ciudad : ciudades) {
            System.out.println("        * "+ciudad);

            
        }
        System.out.println("|__________________________________|");

        System.out.println("El ArrayList es :"+ciudades);

    }

}