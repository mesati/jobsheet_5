/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class prak {
    public static void main(String args[])
    {
        
        System.out.println("Nilai pertama:");
         Scanner console = new Scanner(System.in);
	int b = console.nextInt();
     
        System.out.println("Nilai kedua");
	int c = console.nextInt();
        int res=b-c;
        System.out.println(" The result is "+res);  
    }
}
