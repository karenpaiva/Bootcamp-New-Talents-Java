package lista.duplamente.encadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDuplamentEncadeada =new ListaDuplamenteEncadeada<>();
        minhaListaDuplamentEncadeada.add("Primeiro");
        minhaListaDuplamentEncadeada.add("Segundo");
        minhaListaDuplamentEncadeada.add("Terceiro");
        minhaListaDuplamentEncadeada.add("Quarto");
        minhaListaDuplamentEncadeada.add("Quinto");
        minhaListaDuplamentEncadeada.add("Sexto");
        minhaListaDuplamentEncadeada.add("Sétimo");

        System.out.println(minhaListaDuplamentEncadeada);
        minhaListaDuplamentEncadeada.remove(3);
        minhaListaDuplamentEncadeada.add(3,"Décimo Nono");
        System.out.print(minhaListaDuplamentEncadeada);





    }
}
