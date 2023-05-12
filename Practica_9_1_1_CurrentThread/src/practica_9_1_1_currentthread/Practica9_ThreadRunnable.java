package practica_9_1_1_currentthread;

/**
 *
 * @author emiliomurillo
 */
class Practica9_ThreadRunnable implements Runnable{
    Thread t;
    
    public Practica9_ThreadRunnable(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: "+t);
        t.start(); //start the thread
    }
   //this is the entry point for the second thread
    public void run(){
        try{
            for(int i=5; i>0; i--){
            System.out.println("Child Thread: "+i);
            Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
    System.out.println("Existing child thread. ");
    }
}

class Main {
    public static void main(String[] args) {
        new Practica9_ThreadRunnable();
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