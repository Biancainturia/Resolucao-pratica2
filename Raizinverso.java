import javax.swing.JOptionPane;

public class Raizinverso 
{
    public static void main(String[] args) 
    {
        double num;

        do {
            // Entrada do número
            String input = JOptionPane.showInputDialog("Digite um número (ou -999 para sair):");
            
            // Converte o valor de entrada para número
            num = Double.parseDouble(input);
            
            // Se o número for -999, termina o loop
            if (num == -999) {
                break;
            }

            // Verifica se o número é válido (não negativo) para a raiz quadrada
            if (num >= 0) {
                double raizQuadrada = Math.sqrt(num);
                double inverso = 1 / num;
                
                // Mostra os resultados
                JOptionPane.showMessageDialog(null, 
                    "Número: " + num +
                    "\nRaiz Quadrada: " + raizQuadrada +
                    "\nInverso: " + inverso);
            } else {
                JOptionPane.showMessageDialog(null, "Número negativo não tem raiz quadrada real.");
            }
            
        } while (num != -999);

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
