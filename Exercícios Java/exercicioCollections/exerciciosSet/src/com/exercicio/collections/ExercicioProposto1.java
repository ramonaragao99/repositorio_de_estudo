package com.exercicio.collections;

import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("-" + "Todas as cores do arco-iris" + "-");
        Set<String> cor = new HashSet<>() {{
            add(("Violeta"));
            add(("Anil"));
            add(("Azul"));
            add(("Verde"));
            add(("Amarelo"));
            add(("Laranja"));
            add(("Vermelho"));
        }};
        for (String corarcoiris : cor) System.out.println(" - " + corarcoiris);

        System.out.println("\n-" + "Quantidade de cores que o arco-iris tem" + "-");
        Set<String> cor1 = new HashSet<>(cor);
        Iterator<String> iterador = cor1.iterator();
        int count = 0;
        for (String corarcoiris : cor1) {
            if (corarcoiris != null) count++;
        }
        System.out.println("-" + count + "-");

        //Melhor metodo abaixo pra saber a quantidade coisas ou cores, ou objetos dentro de uma Collections.
        /*System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());*/

        System.out.println("\n-" + "Em ordem alfabética" + "-");
        Set<String> cor2 = new TreeSet<>(cor1);
        for (String corarcoiris : cor2) System.out.println(" - " + corarcoiris + " - ");

        System.out.println("\nExiba as cores na ordem inversa da que foi informada ");
        Set<String> cor3 = new LinkedHashSet<>(cor);
        System.out.println(cor3);
        List<String> coresArcoIrisList = new ArrayList<>(cor3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("\n-" + "Cores com letra V" + "-");
        for (String arcoco : cor) {
            if (arcoco.startsWith("V")) System.out.println(arcoco); //Lembrar que se a letra for
            //maiuscula ou minuscula influência no metodo startswith

        }

        System.out.println("\n-" + "Removendo cores que não começam com a leta V" + "-");
        Iterator<String> iteratorR = cor.iterator();
        while (iteratorR.hasNext()){
            if (!iteratorR.next().startsWith("V")) iteratorR.remove();
        }
        System.out.println(cor);

        System.out.println("\n-" + "Limpando o conjunto" + "-");
        cor.clear();
        System.out.println(cor);
    }
}

/*class CorArcoIris implements Comparable<CorArcoIris>{
    private String cor;

    public CorArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CorArcoIris that = (CorArcoIris) o;
        return cor.equals(that.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(CorArcoIris o) {
        int corarco = CharSequence.compare(this.getCor(), o.getCor()); //Quando quero fazer comaparação entre
        // caracter usar o CharSequence, quando quero comparar inteiros Integer.
        if (corarco != 0) return corarco;
        return this.getCor().compareTo(o.getCor());
    }*/
