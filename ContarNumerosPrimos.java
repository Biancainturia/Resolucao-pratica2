 import javax.swing.JOptionPane;

 public class ContarNumerosPrimos
  {
     public static void main(String[] args)
    {
       int numero;
       int contadorPrimos = 0;

        while (true)
         {
         // Ler um número do usuário
         String entrada = JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para sair):");
         numero = Integer.parseInt(entrada);

         // Verificar se o número é não positivo
          if (numero <= 0) {
          break; // Encerra o loop se o número não for positivo
          }

         // Verificar se o número é primo
          if (ehPrimo(numero))
          {
          contadorPrimos++;
          }
          
          }

         // Exibir a quantidade de números primos encontrados
         JOptionPane.showMessageDialog(null, "Quantidade de números primos digitados: " + contadorPrimos);
        
         // Mensagem final
         JOptionPane.showMessageDialog(null, "Programa encerrado.");
         }

        // Método para verificar se um número é primo
        public static boolean ehPrimo(int num) 
        {
        if (num < 2) 
        {
        return false; // Números menores que 2 não são primos
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