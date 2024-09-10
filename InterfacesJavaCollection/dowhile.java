import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        do {  System.out.println(" ingrese un numero mayor a 0  ");
             num=sc.nextInt();
            
        } while (num <= 0);

        // terminado el ciclo entonce sale mientras tu ingreses un numero negativo te va
        // a seguir pidiendo un valor

        System.out.println("El valor ingresado es :"+num);
    }
    
}
