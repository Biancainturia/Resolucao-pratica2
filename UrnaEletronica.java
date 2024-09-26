 import javax.swing.JOptionPane;
 public class UrnaEletronica
  {
    public static void main(String[] args) 
    {
        // Variáveis para armazenar os votos de cada candidato
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int totalEleitores = 0;

           while (true) 
            {
            // Solicitar o voto do aluno
            String entrada = JOptionPane.showInputDialog("Digite o número do candidato (1, 2, 3, 4) ou -1 para encerrar:");
            int voto = Integer.parseInt(entrada);

            // Verificar se é para encerrar a eleição
            if (voto == -1) 
            {
            break;
            }

            // Contabilizar o voto de acordo com o número do candidato
            switch (voto) 
            {
                case 1:
                    votosCandidato1++;
                    totalEleitores++;
                    break;
                case 2:
                    votosCandidato2++;
                    totalEleitores++;
                    break;
                case 3:
                    votosCandidato3++;
                    totalEleitores++;
                    break;
                case 4:
                    votosCandidato4++;
                    totalEleitores++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Voto inválido! Por favor, vote em um candidato de 1 a 4.");
                    break;
             }
             
             }

        // Calcular o percentual de votos de cada candidato
        if (totalEleitores > 0)
            {
            double percentualCandidato1 = (double) votosCandidato1 / totalEleitores * 100;
            double percentualCandidato2 = (double) votosCandidato2 / totalEleitores * 100;
            double percentualCandidato3 = (double) votosCandidato3 / totalEleitores * 100;
            double percentualCandidato4 = (double) votosCandidato4 / totalEleitores * 100;

            // Exibir os resultados
            StringBuilder resultado = new StringBuilder();
            resultado.append("Total de eleitores: ").append(totalEleitores).append("\n");
            resultado.append("Candidato 1: ").append(votosCandidato1).append(" votos (").append(String.format("%.2f", percentualCandidato1)).append("%)\n");
            resultado.append("Candidato 2: ").append(votosCandidato2).append(" votos (").append(String.format("%.2f", percentualCandidato2)).append("%)\n");
            resultado.append("Candidato 3: ").append(votosCandidato3).append(" votos (").append(String.format("%.2f", percentualCandidato3)).append("%)\n");
            resultado.append("Candidato 4: ").append(votosCandidato4).append(" votos (").append(String.format("%.2f", percentualCandidato4)).append("%)\n");

            JOptionPane.showMessageDialog(null, resultado.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum voto foi registrado.");
        }

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Eleição encerrada.");
     }
  }