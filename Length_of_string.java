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
public class Length_of_string {
    public static void main(String[] args)
   {
      String str;
      int len=0;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = scan.nextLine();
      
      char[] strChars = str.toCharArray();
      for(char ch: strChars)
         len++;
      
      System.out.println("\nLength of String = " +len);
   } 
}
