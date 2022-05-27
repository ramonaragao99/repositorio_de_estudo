package com.exercicio.collections;
import java.util.*;


public class ExemploOrdenaçãoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<carro> carro1 = new HashSet<>(){{
            add(new carro("Fiat", "Uno", 2005));
            add(new carro("Jaguar", "Jaguar 1", 2020));
            add(new carro("Ford", "Ka", 2019));
        }};
        for (carro carro: carro1) System.out.println(carro.getMarca() + "  - "
                + carro.getNomeCarro() + " - " + carro.getAnoCarro());

        System.out.println("--\tOrdem inserção\t--");
        Set<carro> carro2 = new LinkedHashSet<>(){{
           add(new carro("Fiat", "Uno", 2005));
            add(new carro("Jaguar", "Jaguar 1", 2020));
            add(new carro("Ford", "Ka", 2019));
        }};
        for (carro carro: carro2) System.out.println(carro.getMarca() + "  - "
                + carro.getNomeCarro() + " - " + carro.getAnoCarro());

        System.out.println("--\tOrdem natural (Marca)\t--"); //implementar o comparable a classe carro "comparable<carro>"
        Set<carro> carro3 = new TreeSet<>(carro2);
        for (carro carro: carro3) System.out.println(carro.getMarca() + "  - "
                + carro.getNomeCarro() + " - " + carro.getAnoCarro());

        System.out.println("--\tOrdem Marca/Carro/Ano\t--");
        Set<carro> carro4 = new TreeSet<>(new ComparatorMarcaNomeAno());
        carro4.addAll(carro1);
        for (carro carro: carro4) System.out.println(carro.getMarca() + "  - "
                + carro.getNomeCarro() + " - " + carro.getAnoCarro());

        System.out.println("--\tOrdem Nome\t--");
        Set<carro> carro5 = new TreeSet<>(new ComparatorNome());
        carro5.addAll(carro1);
        for (carro carro: carro5) System.out.println(carro.getMarca() + "  - "
                + carro.getNomeCarro() + " - " + carro.getAnoCarro());

        System.out.println("--\tOrdem Marca\t--");
        Set<carro> carro6 = new TreeSet<>(new ComparatorMarca());
        carro6.addAll(carro1);
        for (carro carro: carro6) System.out.println(carro.getMarca() + "  - "
                + carro.getNomeCarro() + " - " + carro.getAnoCarro());
    }
}
class carro implements Comparable<carro>{
    private String Marca;
    private String NomeCarro;
    private Integer AnoCarro;

    public carro(String marca, String nomeCarro, Integer anoCarro) {
        Marca = marca;
        NomeCarro = nomeCarro;
        AnoCarro = anoCarro;
    }

    public String getMarca() {
        return Marca;
    }

    public String getNomeCarro() {
        return NomeCarro;
    }

    public Integer getAnoCarro() {
        return AnoCarro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        carro carro = (carro) o;
        return Marca.equals(carro.Marca) && NomeCarro.equals(carro.NomeCarro) && AnoCarro.equals(carro.AnoCarro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Marca, NomeCarro, AnoCarro);
    }

    @Override
    public String toString() {
        return "{" +
                "Marca='" + Marca + '\'' +
                ", NomeCarro='" + NomeCarro + '\'' +
                ", AnoCarro=" + AnoCarro +
                '}';
    }

    @Override
    public int compareTo(carro carro) {
        int AnoCarro = Integer.compare(this.getAnoCarro(), carro.getAnoCarro());
        if (AnoCarro != 0) return AnoCarro;

        return this.getNomeCarro().compareTo(carro.getNomeCarro());
    }
}
class ComparatorMarcaNomeAno implements Comparator<carro>{

    @Override
    public int compare(carro o1, carro o2) {
        int Marca = o1.getMarca().compareTo(o2.getMarca());
        if (Marca != 0) return Marca;

        int Nome = o1.getNomeCarro().compareTo(o2.getNomeCarro());
        if (Nome != 0) return Nome;

        return o1.getAnoCarro().compareTo(o2.getAnoCarro());
    }
}
class ComparatorNome implements Comparator<carro>{

    @Override
    public int compare(carro o1, carro o2) {
        int Nome = o1.getNomeCarro().compareTo(o2.getNomeCarro());
        if (Nome != 0) return Nome;

        return Nome;
    }
}
class ComparatorMarca implements Comparator<carro>{

    @Override
    public int compare(carro o1, carro o2) {
       int Marca = o1.getMarca().compareTo(o2.getMarca());
       if (Marca != 0) return Marca;

       return Marca;
    }
}