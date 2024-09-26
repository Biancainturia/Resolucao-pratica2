 import javax.swing.JOptionPane;
 public class NumerosImpares
  {
    public static void main(String[] args) 
    {
        // Solicitar ao usuário o limite superior
        String entrada = JOptionPane.showInputDialog("Digite o limite superior:");
        int limiteSuperior = Integer.parseInt(entrada);

        // Construir a string de saída com os números ímpares menores que o limite
        StringBuilder impares = new StringBuilder("Números ímpares menores que " + limiteSuperior + ":\n");

        // avançar para encontrar e imprimir os números ímpares menores que o limite
        for (int i = 1; i < limiteSuperior; i += 2) {  // Incremento de 2 para pegar apenas ímpares
            impares.append(i).append(" ");
        }

        // Exibir a sequência de números ímpares
        JOptionPane.showMessageDialog(null, impares.toString());

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
     }
 }