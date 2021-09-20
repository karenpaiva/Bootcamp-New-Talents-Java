package nativo.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) {
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Ferrari"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Audi"));
        hashSetCarros.add(new Carro("Volkswagem"));
        hashSetCarros.add(new Carro("Nissan"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Audi"));
        treeSetCarros.add(new Carro("Volkswagem"));
        treeSetCarros.add(new Carro("Nissan"));

        System.out.println(treeSetCarros);

    }

}