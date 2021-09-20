package lista.circular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        minhaListaCircular.add("Cabeça");
        minhaListaCircular.add("Ombro");
        minhaListaCircular.add("Joelho");
        minhaListaCircular.add("Pé");
        minhaListaCircular.add("Cauda");
        System.out.println(minhaListaCircular);
        minhaListaCircular.remove(2);
        System.out.println(minhaListaCircular);
        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(3));
        System.out.println(minhaListaCircular.get(4));
        for(int i=0; i<10; i++){
            System.out.println(minhaListaCircular.get(i));
        }


    }
}
