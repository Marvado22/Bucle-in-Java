/**
 * Bucle do-while que termina cuando se introduce por teclado un
 * número impar.
 *
 * @author Luis José Sánchez
 */
public class TerminaCuandoEsImpar {
  public static void main(String[] args) {
    int numero;
      
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 1) {// comprueba si el número introducido es par
        System.out.println("Qué bonito es el " + numero);
      } else {
        System.out.println("No me gustan los números pares, adiós.");
      }
    } while (numero % 2 == 1);
  }
}
