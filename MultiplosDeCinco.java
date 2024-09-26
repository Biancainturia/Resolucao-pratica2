import javax.swing.JOptionPane;

public class MultiplosDeCinco 
{
    public static void main(String[] args) 
    {
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 1; i <= 500; i++) 
        {
            if (i % 5 == 0) 
            {
                resultado.append(i).append("\n");
            }
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString(), "Múltiplos de 5", JOptionPane.INFORMATION_MESSAGE);
    }
}
