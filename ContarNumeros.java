import javax.swing.JOptionPane;

public class ContarNumeros 
{
    public static void main(String[] args) 
    {
        // Contador para números entre 100 e 200

        int contador = 0; 
        
        // Variável para armazenar o número digitado

        int numero; 
        
        while (true) 
        {
            // Solicita ao usuário que digite um número
            String input = JOptionPane.showInputDialog("Digite um número (digite 0 para encerrar):");

            // Verifica se o usuário cancelou ou se a entrada é nula
            if (input == null)
            {
                break; // Sai do loop se o usuário cancelar
            }

            // Converte a entrada para inteiro
            numero = Integer.parseInt(input);

            // Verifica se o número é zero
            if (numero == 0) {
                break; // Sai do loop se o número for zero
            }

            // Verifica se o número está entre 100 e 200
            if (numero >= 100 && numero <= 200) {
                contador++; // Incrementa o contador
            }
        }

        // Exibe a quantidade de números entre 100 e 200
        JOptionPane.showMessageDialog(null, "Você digitou " + contador + " números entre 100 e 200.");
    }
}
