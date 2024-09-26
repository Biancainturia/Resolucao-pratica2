 import javax.swing.JOptionPane;
 public class NumerosImpressos
 {
    public static void main(String[] args)
     {
        // Solicitar ao usuário a quantidade de números pares
        String entrada = JOptionPane.showInputDialog("Digite quantos números pares deseja imprimir:");
        int quantidade = Integer.parseInt(entrada);

        // Construir a string de saída com os números pares
        StringBuilder pares = new StringBuilder("Os " + quantidade + " primeiros números pares são:\n");

        // avançar para encontrar e imprimir os números pares
        int numero = 2;
        for (int i = 1; i <= quantidade; i++)
        {
        pares.append(numero).append(" ");
        numero += 2;  // Incrementar 2 para obter o próximo número par
        }

        // Exibir a sequência de números pares
        JOptionPane.showMessageDialog(null, pares.toString());

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
 }