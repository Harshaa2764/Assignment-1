/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg1;

/**
 *
 * @author Harshada
 */
public class Prime_Numbers_Between_Two_intervals {
  public static void main(String[] args) {
int low = 20, high = 50;
while (low < high) {
if(checkPrimeNumber(low))
System.out.print(low + " ");
++low;
}
}
public static boolean checkPrimeNumber(int num) {
boolean flag = true;
for(int i = 2; i <= num/2; ++i) {
if(num % i == 0) {
flag = false;
break;
}
}
return flag;
}  
}
