package nativo.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome" ,"Maria");
        aluno.put("Idade" ,"20");
        aluno.put("Média" ,"7.8");
        aluno.put("Curso" ,"Arquitatura");
        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());
        List<Map<String, String>> listAluno = new ArrayList<>();
        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome" ,"Julia");
        aluno2.put("Idade" ,"23");
        aluno2.put("Média" ,"8.8");
        aluno2.put("Curso" ,"Física");
        listAluno.add(aluno);
        listAluno.add(aluno2);
        System.out.println(listAluno);



    }
}
