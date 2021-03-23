/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinterview;

import java.util.Scanner;

/**
 *
 * @author ananya
 */
public class CheckBothTheStringsAreRotationOfEachOther {
    public static boolean isRotated(String str1,String str2)
    {
        boolean b=false;
        if(str1==null || str2==null)
        {
            return false;
        }
        else if(str1.length()!=str2.length())
        {
            return false;
        }
        else
        {
            String con=str1+str2;   
            return con.contains(str2);    
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String s2=sc.nextLine();
        System.out.println(isRotated(s1, s2));
        
           
    }
}
