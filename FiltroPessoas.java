 import javax.swing.JOptionPane;

 public class FiltroPessoas
 {
    public static void main(String[] args)
    {
        // Loop para ler dados de 20 pessoas
        for (int i = 1; i <= 20; i++) 
        {
        // Entrada de dados
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + i + ":");
        String idadeEntrada = JOptionPane.showInputDialog("Digite a idade de " + nome + ":");
        String sexo = JOptionPane.showInputDialog("Digite o sexo de " + nome + " (M/F):");

        int idade = Integer.parseInt(idadeEntrada);

        // Verifica se a pessoa é do sexo masculino (M) e tem mais de 21 anos
        if (sexo.equalsIgnoreCase("M") && idade > 21)
        {
        // Imprime o nome da pessoa
        JOptionPane.showMessageDialog(null, nome + " tem mais de 21 anos e é do sexo masculino.");
        }
        
        }

        // Mensagem final
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}