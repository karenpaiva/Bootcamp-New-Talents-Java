package lista.encadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada <String> minhaListaEncadeada = new ListaEncadeada<>();
        minhaListaEncadeada.add("Primeiro");
        minhaListaEncadeada.add("Segundo");
        minhaListaEncadeada.add("Terceiro");
        minhaListaEncadeada.add("Quarto");
        minhaListaEncadeada.add("Quinto");
        minhaListaEncadeada.add("Sexto");

        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.remove(4));
        System.out.println(minhaListaEncadeada);

    }
}
