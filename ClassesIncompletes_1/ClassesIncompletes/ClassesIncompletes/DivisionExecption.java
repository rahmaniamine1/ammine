
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class DivisionExecption {



         static  int x =20;
         static int y ;
         static void main(String[] args) {
                  try{
             Scanner scanner = new Scanner(System.in);
                System.out.println(" Enter un entier");
                 y = scanner.nextInt();
                System.out.println(x/y);
            }
            catch(Exception e) {
                System.out.println("Exception");
            }


}}
