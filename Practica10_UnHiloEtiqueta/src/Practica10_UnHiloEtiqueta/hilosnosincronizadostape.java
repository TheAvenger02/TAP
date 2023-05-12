package Practica10_UnHiloEtiqueta;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emiliomurillo
 */

class Callme{
    void call(String msg){
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    
    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        
        t = new Thread(this);
        t.start();
    }
    public void run(){
        synchronized(target){
        target.call(msg);
        }
    }
}

public class hilosnosincronizadostape {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronized");
        Caller obj3 = new Caller(target, "World");
        //wait for threads to end
        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Interrupted");
            }
    }
}

