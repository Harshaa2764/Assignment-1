/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg1;

/**
 *
 * @author Harshada
 */
public class Remove_all_characters_in_string_except_alphabet {
  public static void main(String[] args)   
{  
//declare a string having special characters   
String str="H/A*R#S;H.A$D%A(";  
String resultStr="";  
//loop execute till the length of the string   
for (int i=0;i<str.length();i++)  
{  
//comparing alphabets with their corresponding ASCII value  
if (str.charAt(i)>64 && str.charAt(i)<=122) //returns true if both conditions returns true  
{  
//adding characters into empty string   
resultStr=resultStr+str.charAt(i);  
}  
}  
System.out.println("String after removing special characters: "+resultStr);  
}    
}
