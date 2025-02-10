package main;

public class Cajero extends Thread {
    private int idCajero;
    private Fila fila;
    private double factorDecansancio;
    
    public Cajero(int idCajero, Fila fila, double factorDecansancio) {
        this.idCajero = idCajero;
        this.fila = fila;
        this.factorDecansancio = 1.0;
    }

    public synchronized void ProcesarCliente(Fila fila){
        
        System.out.printf("El cajero %d comienza a procesar el cliente %d%n", id, id);
        int[] cliente = fila.desencolar;
        double tiempoCalculado = tiempoBase * factorDeCansancio;
        disponible
        
        
    
    }
}
