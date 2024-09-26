 import javax.swing.JOptionPane;

 public class EnergiaEletrica
  {
    public static void main(String[] args) 
    {
      int codigo, tipo;
      double kWh, custo = 0;
      double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
      int countResidencial = 0, countComercial = 0;

      do {
      // Lê o código do consumidor
      String entradaCodigo = JOptionPane.showInputDialog("Digite o código do consumidor (ou 0 para encerrar):");
      codigo = Integer.parseInt(entradaCodigo);

      // Verificar se o código é 0 (encerra o programa)
      if (codigo == 0)
      {
      break;
      }

      // Lê a quantidade de kWh consumidos
      String entradaKWh = JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:");
      kWh = Double.parseDouble(entradaKWh);

      // Lê o tipo do consumidor (1 - residencial, 2 - comercial, 3 - industrial)
      String entradaTipo = JOptionPane.showInputDialog("Digite o tipo do consumidor (1-Residencial, 2-Comercial, 3-Industrial):");
      tipo = Integer.parseInt(entradaTipo);

      // Calcula o custo e acumula o consumo total por tipo de consumidor
      switch (tipo) 
      {
      case 1: // Residencial
      custo = kWh * 0.3;
      totalResidencial += kWh;
      countResidencial++;
      break;
      case 2: // Comercial
      custo = kWh * 0.5;
      totalComercial += kWh;
      countComercial++;
      break;
      case 3: // Industrial
      custo = kWh * 0.7;
      totalIndustrial += kWh;
      break;
      default:
      JOptionPane.showMessageDialog(null, "Tipo de consumidor inválido.");
      continue;
       }

      // Exibir o custo total para o consumidor atual
      JOptionPane.showMessageDialog(null, "Código do consumidor: " + codigo + "\nCusto total: R$ " + String.format("%.2f", custo));

       } while (codigo != 0);

       // Calcular a média de consumo para os tipos 1 (residencial) e 2 (comercial)
        double mediaResidencial = countResidencial > 0 ? totalResidencial / countResidencial : 0;
        double mediaComercial = countComercial > 0 ? totalComercial / countComercial : 0;

       // Exibe o total de consumo por tipo e as médias
        JOptionPane.showMessageDialog(null, "Total de consumo residencial: " + totalResidencial + " kWh\n" +
                                            "Total de consumo comercial: " + totalComercial + " kWh\n" +
                                            "Total de consumo industrial: " + totalIndustrial + " kWh\n\n" +
                                            "Média de consumo residencial: " + mediaResidencial + " kWh\n" +
                                            "Média de consumo comercial: " + mediaComercial + " kWh");

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
     }
 }