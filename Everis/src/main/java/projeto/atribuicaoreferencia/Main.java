package projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int  intA=1;
        int intB=intA;
        System.out.println("Int A = "+intA+" Int B = "+intB);
        intA=2;
        System.out.println("Int A = "+intA+" Int B = "+intB);
        MeuOBJ objA = new MeuOBJ(1);
        MeuOBJ objB =objA;
        System.out.println("obj A = "+objA+" obj B = "+objB);
        objA.setNum(2);
        System.out.println("obj A = "+objA+" obj B = "+objB);
    }
}
