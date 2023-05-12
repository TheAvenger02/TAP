package practica_9_1_1_currentthread;

/**
 *
 * @author emiliomurillo
 */
public class Practica_9_1_1_CurrentThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t =Thread.currentThread();
        System.out.println("Current Thread: "+ t); 

        //Cambiar el nombre del hilo
        t.setName("Mi Hilo"); 
        System.out.println("Current Thread: "+ t);

        try{ 
            for(int i = 5; i> 0; i--){ 
                    System.out.println(i);
                    Thread.sleep(1000); 
            } 
        }catch(InterruptedException e){ 
        System.out.println("Main Thread Interrupted");
        } 
    }
}