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
public class Sum_of_natural_numbers_using_recursion {
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of elements you want:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter all the elements you want:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Sum_of_natural_numbers_using_recursion obj = new Sum_of_natural_numbers_using_recursion();
        int x = obj.add(a, a.length, 0);
        System.out.println("Sum:"+x);
    }
    int add(int a[], int n, int i)
    {
        if(i < n)
        {
            return a[i] + add(a, n, ++i);
        }   
        else
        {
            return 0;
        }
    }
}