import javax.swing.JOptionPane;

 public class NumerosPositivos
  {
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
      
       double soma = 0;
       int contador = 0;
       double numero;
     
       System.out.println("Digite números positivos (digite um número negativo para encerrar):");
     
     //sequencia para entrada de numeros 
     while (true) 
     {
     numero = scanner.nextDouble();
     
     //verificar se o numero é negativo
     if (numero < 0) 
     {
     break; // Sai da sequencia se o número for negativo
     }
     
     //adicionar um numero á soma e incrementar o contador
     soma += numero;
     contador++;
     }
     
     //calcular e imprimir a média, se o contador for maior que 0
     if (contador > 0)
     {
     double media = soma / contador;
        System.out.printf("A média dos números digitados é: %.2f%n", media);
     } else {
         System.out.println("Nenhum número positivo foi digitado.");
     }
     
     scanner.close(); // Fecha o scanner
   }
 }

     

