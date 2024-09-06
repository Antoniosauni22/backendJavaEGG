import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class APP {

    public static void main(String[] args) {
        // trabajando con LinkedList 
        // Son conocidos sobre lista doblemente vinculadas porque 
        // hace referencia a eleementos siguiente y anterior a dicho elemento ingresado en la lista 

        LinkedList<String> miLista= new LinkedList<>();
        miLista.add("lunes");
        miLista.add("martes");
        miLista.add("miercoles");
        miLista.add("jueves");
        miLista.add("viernes");

        miLista.remove("lunes");
        miLista.remove("martes");
        System.out.println(miLista);

        // trabajamos con Set  y hashSet
        Set<String> hashSet=new HashSet<>();

        // agregamos toda la lista milista que tenemos a el hashSet 

        hashSet.addAll(miLista);
        System.out.println(" el hashSet creado es :"+hashSet);
        // removemos elementos
        hashSet.remove("miercoles");
        System.out.println(hashSet);

        
    }
}