package listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Listas implements Runnable{
    private List<Integer> listaEnteros;
    private int n;


    public Listas(int n){
        this.n = n;
        listaEnteros = new ArrayList<Integer>(n);
    }

    public void llenarLista(int n1, int n2){
        for(int i=0;i<n;i++){
            listaEnteros.add(i,(int)(Math.random()*(n2+n1)));
        }
    }

    public void imprimirLista(){
        System.out.print("Lista:  \n");
       for(int i=0;i<n;i++){
           System.out.print(listaEnteros.get(i)+"\n");
       }
    }

    public void buscarElemento(int numero){
        int vecesEncontrado=0;
        for(int i=0;i<n;i++){
            if(listaEnteros.get(i) == numero){
                vecesEncontrado++;
            }
        }
        if (vecesEncontrado != 0){
            System.out.println("Se encontro el nuemero: " + numero +" " + vecesEncontrado + " veces");
        }else {
            System.out.println("No se encontro el numero");
        }

    }


    public static void main(String[] args){
        Listas obj1 = new Listas(20);
        obj1.llenarLista(1,10);
        obj1.imprimirLista();
        obj1.buscarElemento(5);

        HashMap<Integer, String> myHashmap = new HashMap<Integer,String>();

        myHashmap.put(1,"This is the value One");
        myHashmap.put(2,"This is the value Two");
        myHashmap.put(3,"This is the value Three");
        myHashmap.put(4,"This is the value Four");
        myHashmap.put(5,"This is the value Five");

        System.out.println(myHashmap.get(3));



    }


    @Override
    public void run() {

    }
}
