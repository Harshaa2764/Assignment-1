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
public class ASCII_value {
  public static void main(String args[]){
      System.out.println("Enter a character ::");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      int asciiValue = ch;
      System.out.println("ASCII value of the given character is ::"+asciiValue);
   }  
}
