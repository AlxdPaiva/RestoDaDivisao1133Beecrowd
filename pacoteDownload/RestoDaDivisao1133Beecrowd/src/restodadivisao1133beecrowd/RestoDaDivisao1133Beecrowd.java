/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restodadivisao1133beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class RestoDaDivisao1133Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int X = teclado.nextInt();
        int Y = teclado.nextInt();
        int temp;
        
        if (X > Y) {
            temp = X;
            X = Y;
            Y = temp;
        }
        
        for (int c = X + 1; c < Y; c++){
            if (c % 5 == 2 || c % 5 == 3){
                System.out.println(c);
            }
        }
          
    }
    
}
