import java.util.ArrayList;
import java.util.Arrays;

public class arrayVacio {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        
        // Verificar si un Lista esta vacia 
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia ");       
        } else {
            System.out.println("Existen elementos en la lista ");
        }
        // caso lista con elementos :
        ArrayList<String> lista2= new ArrayList<>();
        lista2.add("elemento 1 ");
        // agregar multiples elementos de una lista en una sola linea 

        lista2.addAll(Arrays.asList("elemento 2 "," elemento 3"," elemento 4"));
        System.out.println("Elementos de la lista 2 "+lista2);

        // verificando que la lista 2 no este vacia :

        if (!lista2.isEmpty()) {
            System.out.println("Esta lista no esta vacia ");
            String uno=lista2.get(0);
            System.out.println("Primer elemento de la lista 2  :"+uno);
            
        }else{
            System.out.println("La lista 2 esta vacia.");

        }

    }
}
