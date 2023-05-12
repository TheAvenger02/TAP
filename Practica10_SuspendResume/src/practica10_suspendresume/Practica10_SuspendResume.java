package practica10_suspendresume;

//Manera moderna de suspender y reactivar un hilo

import java.util.logging.Level;
import java.util.logging.Logger;

class NewThread implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;
    
    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        suspendFlag = false;
        t.start();
    }
    
    @Override
    public void run() {
        try{
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized(this){
                    while(suspendFlag){
                           wait();
                    }
                }
            }
        }catch (InterruptedException ex) {
            System.out.println(name + "interrupted.");
        }
        System.out.println(name + "exiting.");
        }
    
    synchronized void miSuspender(){
        suspendFlag = true;
    }
    synchronized void miReactivar(){
        suspendFlag = false;
        notify();
    }
 }
        
/**
 *
 * @author emiliomurillo
 */
public class Practica10_SuspendResume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("One");
        NewThread obj2 = new NewThread("Two");
        
        try{
            Thread.sleep(1000);
            obj1.miSuspender();
            System.out.println("suspendiendo hilo One");
            Thread.sleep(1000);
            obj1.miReactivar();
            System.out.println("reactivando hilo One");
            obj2.miSuspender();
            System.out.println("suspendiendo hilo Two");
            Thread.sleep(1000);
            obj2.miReactivar();
            System.out.println("reactivando hilo Two");
        }catch(InterruptedException e){
            System.out.println("Hilo principal interrumpido");
        }
        // esperar la terminación de los hijos
        try{
            System.out.println("Esperando que terminen los hilos");
            obj1.t.join();
            obj2.t.join();
        } catch(InterruptedException e){
            System.out.println("Hilo principal interrumpido");
        }
        System.out.println("Hilo principal saliendo");
    } 
}