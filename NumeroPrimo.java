 import javax.swing.JOptionPane;

 public class NumeroPrimo 
 {
    public static void main(String[] args)
   {
        // Ler o número do usuário
        String entrada = JOptionPane.showInputDialog("Digite um número para verificar se é primo:");
        int numero = Integer.parseInt(entrada);

        // Chama o método que verifica se o número é primo
        if (ehPrimo(numero)) 
        {
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
        }
        
        }

       // Método para verificar se um número é primo
       public static boolean ehPrimo(int num) {
       // Números menores que 2 não são primos
       if (num < 2)
       {
       return false;
       }

       // Verifica se há divisores de 2 até a raiz quadrada do número
       for (int i = 2; i <= Math.sqrt(num); i++) 
       {
       if (num % i == 0)
       {
       return false; // Se for divisível, não é primo
       }
      
       }

       return true; // Se não encontrou divisores, é primo
    }
 }