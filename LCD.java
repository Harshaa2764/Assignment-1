/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg1;

import java.util.Scanner;

/**
 *
 * @author Harshada
 */
public class LCD {
   public static void main(String args[]){
      int a, b, max, step, lcm = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number ::");
      a = sc.nextInt();
      System.out.println("Enter second number ::");
      b = sc.nextInt();

      if(a > b){
         max = step = a;
      }
      else{
         max = step = b;
      }

      while(a!= 0) {
         if(max % a == 0 && max % b == 0) {
            lcm = max;
            break;
         }
         max += step;
      }
      System.out.println("LCM of given numbers is :: "+lcm);
   }
}