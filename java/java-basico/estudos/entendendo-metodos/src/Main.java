public class Main {
    public static void main(String[] args) {
       
    // Calculadora
    System.out.println("Exercicio Calculadora");
    Calculadora.soma(5, 9);
    Calculadora.subtrai(5, 9);
    Calculadora.divide(6, 3);
    Calculadora.multiplica(5, 9);

    // Mensagem
    System.out.println("Exercicio Mensagem");
    Mensagem.obterMensagem(6);
    Mensagem.obterMensagem(13);
    Mensagem.obterMensagem(18);

    // Empréstimo
    System.out.println("Exercício empréstimo");
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
    Emprestimo.calcular(1000, 5);

    }
}
