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
public class Armstrong_Number {
  public static void main(String[] args) {
      int my_input, my_temp, my_remainder, my_result;
      my_result = 0;
      Scanner my_scanner = new Scanner(System.in);
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      my_temp = my_input;
      while (my_temp != 0){
         my_remainder = my_temp % 10;
         my_result += Math.pow(my_remainder, 3);
         my_temp /= 10;
      }
      if(my_result == my_input)
         System.out.println(my_input + " is an Armstrong number");
      else
         System.out.println(my_input + " is not an Armstrong number");
   }   
}
