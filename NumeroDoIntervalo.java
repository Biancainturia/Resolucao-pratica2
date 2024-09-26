 import javax.swing.JOptionPane;

 public class NumeroDoIntervalo
 {
    public static void main(String[] args) 
    {
        // Solicitar ao usuário o limite superior e o incremento
        String entradaLimite = JOptionPane.showInputDialog("Digite o limite superior:");
        String entradaIncremento = JOptionPane.showInputDialog("Digite o incremento:");

        int limiteSuperior = Integer.parseInt(entradaLimite);
        int incremento = Integer.parseInt(entradaIncremento);

        // Verificar se o incremento é válido
        if (incremento <= 0) {
            JOptionPane.showMessageDialog(null, "O incremento deve ser maior que 0.");
        } else {
        // Constróir a string de saída com os números no intervalo
        StringBuilder saida = new StringBuilder("Números no intervalo de 0 até " + limiteSuperior + " com incremento de " + incremento + ":\n");

        // avançar para gerar os números de 0 até o limite superior com o incremento
         for (int i = 0; i <= limiteSuperior; i += incremento)
        {
        saida.append(i).append(" ");
        }

        // Exibir a saída
        JOptionPane.showMessageDialog(null, saida.toString());
        }

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
 }