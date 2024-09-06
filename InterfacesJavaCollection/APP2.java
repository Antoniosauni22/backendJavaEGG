import java.util.HashSet;

public class APP2 {
    public static void main(String[] args) {
        // creamos un hashSet de tipo Libro (lista tipo libro )
        HashSet<Libro> set =new HashSet<>();
        Libro uno=new Libro("el quijote de la mancha ", " cervantes", 02323);
        Libro dos=new Libro("tus zonas erronaeas","walter Dayer",234);
        // agregamos los dos libroa al HashSet 
        set.add(uno);
        set.add(dos);
        //verificando si un libro se encuentra en el HashSet 
        Libro tres=new Libro("tus zonas erronaeas","walter Dayer",234);
        boolean respuesta=set.contains(tres);
        System.out.println(" respuesta :"+respuesta);
        //eliminamos el libro 1 

        set.remove(uno);
        System.out.println("+-------------------------LIBROS ---------------------------------+");
        System.out.println("+----- TITULO ---------------- AUTOR -------------------ISBN------+");

        for (Libro libro : set) {
            System.out.println(" * "+libro.getTitulo()+" , "+libro.getAutor()+" ,"+libro.getISBN());
            
        }
        System.out.println("------------------------------------------------------------------");




    }
    
}
