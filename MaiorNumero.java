import javax.swing.JOptionPane;

public class MaiorNumero
 {
    public static void main(String[] args)
   {
     int numero;
     int maiorNumero = Integer.MIN_VALUE; // Inicializa com o menor valor possível

      while (true) 
      {
      // Ler um número do usuário
         String entrada = JOptionPane.showInputDialog("Digite um número (ou -9999 para sair):");
         numero = Integer.parseInt(entrada);

      // Verificar se o número é -9999
         if (numero == -9999)
         {
          break; // Encerra o loop se o número for -9999
         }

      // Atualizar o maior número se o número atual for maior
         if (numero > maiorNumero)
         {
         maiorNumero = numero;
         }
         
         }

      // Verificar se pelo menos um número foi digitado
        if (maiorNumero != Integer.MIN_VALUE)
        {
      // Exibir o maior número encontrado
        JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maiorNumero);
        } else {
        JOptionPane.showMessageDialog(null, "Nenhum número válido foi digitado.");
        }

     // Mensagem final
       JOptionPane.showMessageDialog(null, "Programa encerrado.");
     }
 }