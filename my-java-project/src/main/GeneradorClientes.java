package main;
import java.util.Random;

public class GeneradorClientes extends Thread {

    private int uid=1;
    private int numeroClientes;
    private Fila fila;
    private Random random = new Random();
    
    public GeneradorClientes(int numeroClientes, Fila fila){
        this.fila=fila;
        this.numeroClientes=numeroClientes;
    }
    
    @Override
    public void run(){
        //Creamos un cliente
        while(numeroClientes>0){
        Thread.sleep(500);
        int tiempoProcesamiento = random.nextInt(200);
        int[] cliente = {uid,tiempoProcesamiento};
        this.uid++;
        //Encolamos el cliente
        fila.encolar(cliente);
        numeroClientes--;
        }
    }
}

