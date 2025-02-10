package main;

import java.util.ArrayList;

public class Fila {
    private static ArrayList<> clientesFila = new ArrayList<>();

    public synchronized void encolar(int[] cliente){   
        clientesFila.Add(cliente);
    }

    public synchronized int[] desencolar(){
        wait();
        int[] cliente=clientesFila.get(0);
        clientesFila.remove(0);
        return cliente;
    }
}
