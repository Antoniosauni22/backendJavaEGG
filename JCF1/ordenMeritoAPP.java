import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ordenMeritoAPP {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        
        int nota = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("ingrese nota :" + (i + 1) + " :");
            nota = sc.nextInt();

            if (nota >= 1 && nota <= 10) {
                System.out.println(" ingresado ");
                notas.add(nota);
            } else {
                System.out.println(" nota fuera del rango !!! ");
            }

        }
        System.out.println("Notas en orden de ingreso :"+notas);
        // ordenando los numero de forma descendente 
        Collections.sort(notas);
        System.out.println("Notas ordenadas con Collection.sort :"+notas);
        Collections.sort(notas,Collections.reverseOrder());
        System.out.println("Notas ordenadas de forma descendente con reverOder de collection "+notas);

    }

}
