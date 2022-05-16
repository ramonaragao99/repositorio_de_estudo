package dio.exercicioOperadorRelacional;

public class Main {
    public static void main(String[] args) {

        int i = 10;
        int ii = 9;
        float o = 10;
        float oo = 9;
        String p = "Ola mundo !!";
        String pp = "Ola tudo bem ?";
        char c = 'u';
        char cc = 'o';
        boolean b = false;
        boolean bb = true;

        System.out.println("int i == int ii: " + (i == ii));
        System.out.println("int i != int ii: " + (i != ii));
        System.out.println("int i > int ii: " + (i > ii));
        System.out.println("int i <= int ii: " + (i <= ii));

        System.out.println("float o == float oo: " + (o == oo));
        System.out.println("float o != float oo: " + (o != oo));
        System.out.println("float o > float oo: " + (o > oo));
        System.out.println("float o <= float oo: " + (i <= ii));

        System.out.println("String p == String pp: " + (p == pp));
        System.out.println("String p != String pp: " + (p != pp));
       // System.out.println("String p > String pp: " + (p > pp)); // não tem lógica
       // System.out.println("String p <= String pp: " + (p <= pp)); // também não tem

        System.out.println("char c == char cc: " + (c == cc));
        System.out.println("char c != char cc: " + (c != cc));
        System.out.println("char c > char cc: " + (c > cc)); //Não tem lógica mas funciona porque o que designa o char é um codigo
        System.out.println("char c <= char cc: " + (c <= cc)); //Não tem também

        System.out.println("Boolean c == Boolean cc: " + (b == bb));
        System.out.println("Boolean c != Boolean cc: " + (b != bb));
       // System.out.println("Boolean c > Boolean cc: " + (b > bb)); //Não tem logica
       // System.out.println("Boolean c <= Boolean cc: " + (b <= bb)); //Nao tem logica

    }
}
