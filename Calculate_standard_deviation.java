/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg1;

/**
 *
 * @author Harshada
 */
public class Calculate_standard_deviation {
   public static void main(String[] args) {
      double[] input_array = { 35, 48, 60, 71, 80, 95, 130};
      System.out.println("The elements of the array is defined as");
      for (double i : input_array) {
         System.out.print(i +" ");
      }
      double sum = 0.0, standard_deviation = 0.0;
      int array_length = input_array.length;
      for(double temp : input_array) {
         sum += temp;
      }
      double mean = sum/array_length;
      for(double temp: input_array) {
         standard_deviation += Math.pow(temp - mean, 2);
      }
      double result = Math.sqrt(standard_deviation/array_length);
      System.out.format("\n\nThe Standard Deviation is: %.6f", result);
   } 
}
