package one.exercicio.metodo;

public class Mensagem {

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemBomdia();
            case 13, 14, 15, 16, 17 -> mensagemBoatarder();
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> mensagemBoanoite();
            default -> System.out.println("Hora inválida");
        }

    }

    public static void mensagemBomdia() {

        System.out.println("Bom diaaa !!!!!");
    }

    public static void mensagemBoatarder() {

        System.out.println("Boa tardeeeee !!!!!");

    }

    public static void mensagemBoanoite() {

        System.out.println("Boa noiteeee!!!!!!");
    }
}
