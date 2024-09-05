import java.util.ArrayList;

public class numeroElementos {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        // obtener el tamaño de la lista 
         int tamaño=numeros.size();
         System.out.println("El tamaño de la lista de numero es :"+tamaño);
    }
}
