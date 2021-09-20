package nativo.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackcarros = new Stack<>();
        stackcarros.push(new Carro("Ford"));
        stackcarros.push(new Carro("Fiat"));
        stackcarros.push(new Carro("Audi"));
        stackcarros.push(new Carro("Ferrari"));
        System.out.println(stackcarros);
        System.out.println(stackcarros.pop());
        System.out.println(stackcarros);
        System.out.println(stackcarros.peek());
        System.out.println(stackcarros);
        System.out.println(stackcarros.empty());




    }
}
