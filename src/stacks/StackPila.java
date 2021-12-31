package stacks;


/*
    *push()
    * pop()
    * peek()
    * empty()
    * @param args
 */

/*FILO          First-Input  Last-Output*/

import java.util.Stack;

public class StackPila {



    public static void main(String[] args){
        Stack pila = new Stack();
        Stack<String> pilaStrings = new Stack<String>();
        for(int i=0;i<10;i++){
            pila.push(i);
        }

        for(int i=0;i<3;i++){
            pila.pop();
        }

        while (!pila.empty()){
            System.out.println(pila.peek());
            pila.pop();
        }

        System.out.println("Vacia: " + pila.empty());







    }

}
