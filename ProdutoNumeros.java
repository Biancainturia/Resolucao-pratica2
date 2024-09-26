import javax.swing.JOptionPane;
import java.math.BigInteger;

public class ProdutoNumeros 
{
    public static void main(String[] args) 
    {
       // Usando BigInteger para evitar estouro de valor
       
        BigInteger produto = BigInteger.ONE; 

        for (int i = 120; i <= 300; i++) 
        {
            produto = produto.multiply(BigInteger.valueOf(i));
        }

        // Exibir o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "O produto de todos os números de 120 a 300 é: " + produto);
    }
}
