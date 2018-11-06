package agendaobjetos;

/**
 * @author alumno
 */
public class Agendaobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 111, 10);
        Persona persona2 = new Persona("Pepe", 222);
        
        Persona[] vAgenda = new Persona[5];
        vAgenda[0]= persona1;
        vAgenda[1]= persona2;
        
          
        for (int i = 0; i < vAgenda.length; i++) {
            if (vAgenda[i]!=null){
                System.out.println(vAgenda[i].toString());   
            }
        }
    }
    
}
