 import javax.swing.JOptionPane;

 public class CalculoFatorial
  {
    public static void main(String[] args)
    {
        // Solicitar ao usuário um número inteiro
        String entrada = JOptionPane.showInputDialog("Digite um número para calcular o fatorial:");
        int numero = Integer.parseInt(entrada);

        // Calcular o fatorial
        long fatorial = calcularFatorial(numero);

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
       }

        // Método para calcular o fatorial de um número
        public static long calcularFatorial(int n)
      {
        if (n == 0 || n == 1)
      {
        return 1; // O fatorial de 0 e 1 é 1
      }

        long resultado = 1;
        for (int i = 2; i <= n; i++)
        {
        resultado *= i; // Multiplicar os números de 2 até n
        }
        return resultado;
     }
 }