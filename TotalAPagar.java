 import javax.swing.JOptionPane;
 public class TotalAPagar
  {
    public static void main(String[] args) 
    {
       double total = 0.0;  // Variável para armazenar o total a ser pago
        
        // avançar principal para ler os preços e quantidades
            while (true) 
            {
            double preco = -1;
            int quantidade = -1;

            // Solicitar e validar o preço da mercadoria (não pode ser negativo)
            do 
            {
            String entradaPreco = JOptionPane.showInputDialog("Digite o preço da mercadoria:");
            preco = Double.parseDouble(entradaPreco);
            if (preco < 0) 
            {
            JOptionPane.showMessageDialog(null, "Preço inválido! O preço não pode ser negativo.");
            }
            
            } while (preco < 0);

            // Solicitar e validar a quantidade de itens (não pode ser negativa)
            do 
            {
            String entradaQuantidade = JOptionPane.showInputDialog("Digite a quantidade de itens comprados (ou 0 para terminar):");
            quantidade = Integer.parseInt(entradaQuantidade);
            if (quantidade < 0) 
            {
            JOptionPane.showMessageDialog(null, "Quantidade inválida! A quantidade não pode ser negativa.");
            } 
            
            } while (quantidade < 0);

            // Se a quantidade for 0, sair do loop
            if (quantidade == 0) 
            {
            break;
            }

            // Adiciona ao total (preço * quantidade)
            total += preco * quantidade;
            }

            // Exibe o total a ser pago
            JOptionPane.showMessageDialog(null, "O total a ser pago é: R$ " + String.format("%.2f", total));
        
            // Mensagem final
            JOptionPane.showMessageDialog(null, "Programa encerrado.");
      }
  }