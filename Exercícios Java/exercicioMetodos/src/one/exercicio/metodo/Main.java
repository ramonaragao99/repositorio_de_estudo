package one.exercicio.metodo;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nExércicio calculadora\n");

        Calcualdora.soma(5, 5);
        Calcualdora.subtracao(5,5);
        Calcualdora.multiplicacao(5,5);
        Calcualdora.divisao(5,5);

        System.out.println("\nExercício hora\n");

        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(40);

        System.out.println("\nExercício empréstimo\n");

        Emprestimo.calcular(1200,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500,5);

    }
}
