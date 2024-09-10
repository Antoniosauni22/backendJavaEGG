import java.util.ArrayList;
import java.util.Scanner;

public class TurneroAPP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> turnos=new ArrayList<>();
        // son 20 las personas que vinieron y los turnos son reservados segun orden de llegada
        for (int i = 1; i <= 20; i++) {
            turnos.add(i);  
        }
        // creamos un aleatorio
        sc.close();
        System.out.println("LOS TURNOS HASTA EL MOMENTO SON :"+turnos);
        int aleatorio=(int) ((Math.random()* (20) +1));
        System.out.println(" el turno sorteado a atenderse es :"+aleatorio);

        System.out.println("respuesta a busqueda del numero aleatorio :"+turnos.contains(aleatorio));
        int posicion =turnos.get(aleatorio);
        System.out.println("La posicio del numero sorteado en la lista de turnos es :"+posicion);




        
    }
        
}
