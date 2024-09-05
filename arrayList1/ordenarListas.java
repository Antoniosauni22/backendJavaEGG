import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ordenarListas {
    public static void main(String[] args) {
        // lista de elementos de tipo String 
        ArrayList<String> lista =new ArrayList<>();
        lista.add("manzana");
        lista.add("naranja");
        lista.add("banana");
        // metodo para ordenar la lista de forma alphabetica en este caso ascendente 
        System.out.println("La lista creada  es :"+lista);

        Collections.sort(lista);
        System.out.println("La lista ordenada es :"+lista);

        // mostramos la lista por elementos con un for each 

        for (String elemento : lista) {
            System.out.println(" elemento :"+elemento);
            
        }


        // Lista de elementos de tipo Integer 
        ArrayList<Integer> numeros =new ArrayList<>();
       
        numeros.add(9);
        numeros.add(3);
        numeros.add(10);
        numeros.add(12);
        numeros.add(2);
        numeros.add(1);

        System.out.println("La lista creada es :"+numeros);
       
        // ordenamos los elementos de forma ascendente 

         Collections.sort(numeros);
         for (Integer numero : numeros) {
            System.out.println(" elemento :"+numero);
            
         }

        
    }
    
}
