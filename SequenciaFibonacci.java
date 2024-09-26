 import javax.swing.JOptionPane;

 public class SequenciaFibonacci 
 {
    public static void main(String[] args)
    {
        // Ler um número do usuário
        String entrada = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(entrada);

        // Verificar se o número é positivo
        if (numero < 1)
        {
          JOptionPane.showMessageDialog(null, "Por favor, digite um número positivo.");
        } else {
         // Exibir a sequência de Fibonacci
         StringBuilder fibonacci = new StringBuilder("Sequência de Fibonacci até " + numero + ": ");

         // Variáveis para os dois primeiros números da sequência
           int a = 0;
           int b = 1;

         // Gera a sequência
            while (b <= numero) {
            fibonacci.append(b).append(" ");
            int proximo = a + b; // Calcula o próximo número na sequência
                a = b;              // Atualiza a
                b = proximo;        // Atualiza b
            }

         // Exibe a sequência
            JOptionPane.showMessageDialog(null, fibonacci.toString());
            }

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
     }
  }