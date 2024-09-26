import javax.swing.JOptionPane;

public class Numeros1a100 
{
    public static void main(String[] args) 
    {
        StringBuilder numeros = new StringBuilder();
        int soma = 0;

        // Gera os números de 1 a 100 e calcula a soma
        for (int i = 1; i <= 100; i++) 
        {
            numeros.append(i).append(" ");
            soma += i;
        }

        // Exibe os números e a soma usando JOptionPane
        JOptionPane.showMessageDialog(null, "Números de 1 a 100:\n" + numeros.toString());
        JOptionPane.showMessageDialog(null, "Soma dos números: " + soma);
    }
}
