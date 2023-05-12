package practica_9_1_1_currentthread;

/**
 *
 * @author emiliomurillo
 */
class NewThread extends Thread{
    NewThread(){
        super("Nuevo Hilo");
        System.out.println("Child Thread: "+this);
        start(); //start the thread
    }
   //this is the entry point for the second thread
    public void run(){
        try{
            for(int i=5; i>0; i--){
            System.out.println("Child Thread: "+i);
            Thread.sleep(500*i);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
    System.out.println("Existing child thread. ");
    }
}

public class Practica9_ThreadClass {
    public static void main(String[] args) {
        Practica9_ThreadClass obj = new Practica9_ThreadClass();
        try{
            for(int i = 5; i>0; i--){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1100);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted ");
        }
        System.out.println("Main Thread existing");
    }
}