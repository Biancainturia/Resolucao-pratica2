 import javax.swing.JOptionPane;

 public class Conversaodegraus 
 {
    public static void main(String[] args)
     {
        // Solicitar os valores para o limite inferior, superior e o incremento
        String entradaInferior = JOptionPane.showInputDialog("Digite o limite inferior em graus Celsius:");
        String entradaSuperior = JOptionPane.showInputDialog("Digite o limite superior em graus Celsius:");
        String entradaIncremento = JOptionPane.showInputDialog("Digite o incremento:");

        int limiteInferior = Integer.parseInt(entradaInferior);
        int limiteSuperior = Integer.parseInt(entradaSuperior);
        int incremento = Integer.parseInt(entradaIncremento);

        // Cabeçalho da tabela
        StringBuilder tabela = new StringBuilder();
        tabela.append("Tabela de conversão de Celsius para Fahrenheit\n");
        tabela.append("=============================================\n");
        tabela.append("Celsius\t\tFahrenheit\n");

        // avançar para calcular e exibir a conversão de Celsius para Fahrenheit
        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento)
        {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;  // Fórmula de conversão
            tabela.append(celsius).append("\t\t").append(String.format("%.2f", fahrenheit)).append("\n");
        }

        // Exibir a tabela de conversão
        JOptionPane.showMessageDialog(null, tabela.toString());

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
      }
  }