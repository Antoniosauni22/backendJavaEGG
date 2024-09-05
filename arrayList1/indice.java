import java.util.ArrayList;

public class indice {
    public static void main(String[] args) {
         ArrayList<Double> precios = new ArrayList<>();

         // Agregar elementos de la lista 
         precios.add(10.5);
         precios.add(24.5);
         precios.add(25.6);

         // obtener un elemento por un indice 1 
         
         double precio = precios.get(1);
         System.out.println(" elementos en el indice o :"+precio);
         


    }
    
}
