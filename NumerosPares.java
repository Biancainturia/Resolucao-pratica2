 import javax.swing.JOptionPane;

 public class NumerosPares
  {
    public static void main(String[] args) 
    {
     //iniciar um contador para os numeros pares
     int contador = 0;
     // Iniciar um número em 2, que é o primeiro número par
     int numeroPar = 2;
     
     //quando o contador for menor que 100
     while (contador < 100) 
     {
     //imprimir o numero por atual
     System.out.println(numeroPar);
     //incrementar o contador
     contador++;
     //avançar para o proximo numero par (2, 4, 6, ...)
     numeroPar  += 2;
     }
   }
 }    