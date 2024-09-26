import javax.swing.JOptionPane;

public class DivisoresNumeros 
{
    public static void main(String[] args) 
    {
        int numero;

        // Loop até o usuário digitar -999
        do 
        {
            // Entrada de dados usando JOptionPane
            String entrada = JOptionPane.showInputDialog("Digite um número (ou -999 para sair):");
            numero = Integer.parseInt(entrada);

            // Verifica se o número não é o valor de saída
            if (numero != -999) 
            {
                StringBuilder divisores = new StringBuilder("Divisores de " + numero + ": ");

                // Encontrando e listando os divisores
                for (int i = 1; i <= Math.abs(numero); i++) 
                {
                    if (numero % i == 0) {
                        divisores.append(i).append(" ");
                    }
                }

                // Exibe os divisores usando JOptionPane
                JOptionPane.showMessageDialog(null, divisores.toString());
            }

        } while (numero != -999);

        // Mensagem de saída
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
