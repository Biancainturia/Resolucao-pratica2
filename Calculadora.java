import javax.swing.JOptionPane;

public class Calculadora
 {
    public static void main(String[] args) 
    {
        // Ler os dois números reais
        String entrada1 = JOptionPane.showInputDialog("Digite o primeiro número real:");
        double numero1 = Double.parseDouble(entrada1);

        String entrada2 = JOptionPane.showInputDialog("Digite o segundo número real:");
        double numero2 = Double.parseDouble(entrada2);

        int opcao;

        do
        {
            // Apresentar o menu
            String menu = "Operações Disponíveis:\n" +
                          "1. Adição\n" +
                          "2. Subtração\n" +
                          "3. Multiplicação\n" +
                          "4. Divisão\n" +
                          "9. Sair do Programa\n" +
                          "Digite o número de ordem da opção desejada:";

            String entradaOpcao = JOptionPane.showInputDialog(menu);
            opcao = Integer.parseInt(entradaOpcao);

            // Executar a operação escolhida
            switch (opcao)
             {
                case 1:
                    double resultadoAdicao = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da Adição: " + resultadoAdicao);
                    break;
                case 2:
                    double resultadoSubtracao = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da Subtração: " + resultadoSubtracao);
                    break;
                case 3:
                    double resultadoMultiplicacao = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " + resultadoMultiplicacao);
                    break;
                case 4:
                    if (numero2 != 0) {
                        double resultadoDivisao = numero1 / numero2;
                        JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + resultadoDivisao);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha uma opção válida.");
                    break;
                    }
                    } while (opcao != 9);
         }
  }