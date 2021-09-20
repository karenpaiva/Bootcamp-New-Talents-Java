package projeto.atribuicaoreferencia;

public class MeuOBJ {
    Integer num;

    public MeuOBJ(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num ){
        this.num=num;
    }
    @Override
    public String toString() {
        return this.num.toString();
    }


}
