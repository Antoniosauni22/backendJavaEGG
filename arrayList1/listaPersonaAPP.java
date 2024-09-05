import java.util.ArrayList;

public class listaPersonaAPP {
    public static void main(String[] args) {
        Persona p1= new Persona(111111, " jose luis "," peralez bardales");
        Persona p2= new Persona(222222, " julio cesar", " lopez pezo");
        Persona p3= new Persona(33333," elmer luis", " gutierrez abisrror ");
        Persona p4= new Persona(44444, " lenin marcos", " piñari vela");
        Persona p5= new Persona(55555," elmer luis", "fonseca vasquez ");

        ArrayList<Persona> personas= new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
   
         // INVOCAMOS AL MÉTODO ESTATICO CREADO PARA OBTENER EL TAMAÑO DE LA INSTANCIA CREADA personas(lista)
         System.out.println("El tamaño del lista creado personas es :"+obternerTamaño(personas)+" \n");

         System.out.println("Los elementos son los siguientes : \n");

         imprimirLista(personas);

    }

    // metodo para obtener el tamaño del arreglo 

    public static int obternerTamaño(ArrayList<Persona> lista){
        return lista.size();

    }
    // metodo para imprimir el arreglo
    public static void imprimirLista(ArrayList<Persona> lista){
        for (Persona elemento : lista) {
            System.out.println(" "+elemento.getApellido()+ " , " +elemento.getNombre()+" , "+elemento.getDocumento());
            System.out.println("--------------------------------------------------------------------");
            
        }

    }


    // metodo para conocer si un elemento esta en lista

    public static boolean encontrarObjeto(ArrayList<Persona> lista, Persona individuo){
        // retorna verdadero si el elemento se encuentra dentro del arreglo 
        return lista.contains(individuo);
    }



    
}
