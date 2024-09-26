  import javax.swing.JOptionPane;

  public class ContarIdades 
 {
    public static void main(String[] args)
  {
    int idade;
    int totalMenosDe21 = 0;
    int totalMaisDe50 = 0;

    while (true)
    {
    // Ler a idade
    String entrada = JOptionPane.showInputDialog("Digite a idade (ou uma idade fora da faixa 0-120 para sair):");
    idade = Integer.parseInt(entrada);

    // Verificar se a idade está fora da faixa
    if (idade < 0 || idade > 120)
    {
    break;
    }

    // Contar as idades conforme as condições
    if (idade < 21)
    {
    totalMenosDe21++;
    }
    if (idade > 50)
    {
    totalMaisDe50++;
    }
    }

    // Exibir os resultados
    JOptionPane.showMessageDialog(null, "Total de pessoas com menos de 21 anos: " + totalMenosDe21 + "\n" +
                                            "Total de pessoas com mais de 50 anos: " + totalMaisDe50);
        
    // Mensagem final
    JOptionPane.showMessageDialog(null, "Programa encerrado.");
   }
}