package nativo.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Volkswagen"));
        listaCarros.add(new Carro("Audi"));
        listaCarros.add(new Carro("Mercedes"));
        System.out.println(listaCarros.contains(new Carro("Nissan")));
        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println((new Carro("Ford").hashCode()));
        System.out.println((new Carro("Audi").hashCode()));
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Audi");
        System.out.println(carro1.equals(carro2));

    }
}
