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
public class Concatenate_Two_Strings {
   public static void main(String args[])
	{
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string:");
	 	str1=sc.nextLine();
		System.out.println("Enter the 2nd string:");
	 	str2=sc.nextLine();
  		System.out.println("Concatenated String is: ");
  		System.out.println(str1.concat(str2));
	} 
}
