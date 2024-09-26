import javax.swing.JOptionPane;

public class NomeEntrada 
{
    public static void main(String[] args) 
    {
        String nome;

        // Repetir enquanto o nome for diferente de "FIM"
        do {
            nome = JOptionPane.showInputDialog("Digite um nome (ou FIM para encerrar):");

            // Verifica se o nome não é "FIM" antes de imprimir
            if (!nome.equalsIgnoreCase("FIM")) {
                JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
