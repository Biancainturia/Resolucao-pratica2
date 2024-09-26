 import javax.swing.JOptionPane;

 public class ConversaodePolegadas
 {
    public static void main(String[] args)
    {
        StringBuilder tabela = new StringBuilder();
        tabela.append("Tabela de conversão de polegadas para centímetros\n");
        tabela.append("===============================================\n");

        // sequencia para converter de 1 até 20 polegadas
        for (int polegadas = 1; polegadas <= 20; polegadas++) 
        {
            double centimetros = polegadas * 2.54;
            tabela.append(polegadas).append(" polegada(s) = ").append(String.format("%.2f", centimetros)).append(" cm\n");
        }

        // Exibir a tabela de conversão
        JOptionPane.showMessageDialog(null, tabela.toString());

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
 }