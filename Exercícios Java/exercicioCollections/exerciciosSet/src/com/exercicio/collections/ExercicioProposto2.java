package com.exercicio.collections;

import com.sun.source.tree.UsesTree;

import javax.xml.stream.events.Characters;
import java.sql.Array;
import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagemfav = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 1991,"Intellij"));
            add(new LinguagemFavorita("Python", 1991, "Visual Studio"));
            add(new LinguagemFavorita("JavaScript", 1995, "Pycharm"));
            add(new LinguagemFavorita("C", 1970, "EclipseIDE"));
            add(new LinguagemFavorita("C#", 1991, "NetBeans"));
        }};

        System.out.println("-" + "Ordem de inserção" + "-"); //sempre que imprimir uma set por ordem de inserção
        //usar uma LinkedHashset e passa como parametro um Arrays.asList(atribuir os valores da Set aqui)
        Set<LinguagemFavorita> linguagemfav1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Java", 1991,"Intellij"),
        new LinguagemFavorita("Python", 1991, "Visual Studio"),
        new LinguagemFavorita("JavaScript", 1995, "Pycharm"),
        new LinguagemFavorita("C", 1970, "EclipseIDE"),
        new LinguagemFavorita("C#", 2000, "NetBeans")
                )
        );
        for (LinguagemFavorita linguagem: linguagemfav1) System.out.println(linguagem);

        System.out.println("\n-" + "Ordem natural: nome" + "-");
        Set<LinguagemFavorita> linguagemfav2 = new TreeSet<>(linguagemfav1); //sempre implementar o comparable
        for (LinguagemFavorita linguagem:linguagemfav2) System.out.println(linguagem);

        System.out.println("\n-" + "Ordem IDE" + "-");
        Set<LinguagemFavorita> linguagemfav3 = new TreeSet<LinguagemFavorita>(new comparatorIDE());
        //quando usar o comparator no TreeSet, atribuir a Set princial como argumento no <>.
        linguagemfav3.addAll(linguagemfav);
        for (LinguagemFavorita linguagem: linguagemfav3) System.out.println(linguagem);

        System.out.println("\n-" + "Ordem Ano de criação e nome" + "-");
        Set<LinguagemFavorita> linguagemfav4 = new TreeSet<LinguagemFavorita>(new comparatorANOeNOME());
        linguagemfav4.addAll(linguagemfav);
        for (LinguagemFavorita linguagem: linguagemfav4) System.out.println(linguagem);

        System.out.println("\n-" + "Ordem ano de criação e IDE");
        Set<LinguagemFavorita> linguagemfav5 = new TreeSet<LinguagemFavorita>(new comparatorANOeIDE());
        linguagemfav5.addAll(linguagemfav);
        for (LinguagemFavorita linguagem:linguagemfav5) System.out.println(linguagem);

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private final String nome;
    private final Integer anoCriação;
    private final String ide;

    public LinguagemFavorita(String nome, Integer anoCriação, String ide) {
        this.nome = nome;
        this.anoCriação = anoCriação;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoCriaçao() {
        return anoCriação;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoCriação='" + anoCriação + '\'' +
                ", ide=" + ide +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemfavorita0) {
        return this.nome.compareTo(linguagemfavorita0.nome);
    }
}

class comparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}
// o metodo compare do Integer ou CharSequence retorna um 0 se o1 == o2, 1 se o1 > o2 , -1 se o1 < o2
// com isso podemos implementar alguma estrutra condicional, if, switch
// e adicionar mais outro metodo de comparação na class.
class comparatorANOeIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int compare1 = Integer.compare(o1.getAnoCriaçao(), o2.getAnoCriaçao());
        if (compare1 != 0) return compare1;

        return CharSequence.compare(o1.getIde() , o2.getIde());
    }
}
//Sempre usar o comparator no Treeset, é melhor.
//adiciona a lista de uma hashset nele pelo metodo addAll e chuva.
class comparatorANOeNOME implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int compare0 = Integer.compare(o1.getAnoCriaçao(), o2.getAnoCriaçao());
        if (compare0 != 0) return compare0;

        return CharSequence.compare(o1.getNome(), o2.getNome());
    }
}