import java.util.ArrayList;
import java.util.Scanner;

public class sopaNumerosAPP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int num = 0;
        do {
            System.out.print("INGRESE NUMERO :");
            num = sc.nextInt();
            if (num != -99) {
                numeros.add(num);
                System.out.println(num+", guardado correctamente");

            } else {
                System.out.println("saliendo ..");

            }

        } while (num != -99);
        System.out.println("|-----------------------------------|");
        System.out.println("|-----LISTA DE NUMEROS AÑADIDOS-----|");
        for (Integer numero : numeros) {
        System.out.println("            * " + numero+"           ");
        }
        System.out.println("|-----------------------------------|");
        System.out.println(" la lista de numero es :" + numeros);

    }

}