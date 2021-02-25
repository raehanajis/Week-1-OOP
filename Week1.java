/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

public class Week1 {
 
    public static void main(String[] args) {
        
        int val, seconds, minute, hours;
        
        //Buat Object input
        Scanner masuk = new Scanner(System.in);
        
        //Buat Value
        System.out.println("Enter an integer for seconds:");
        val = masuk.nextInt();
        
        seconds = val % 60 ;
        hours   = val / 60 ;
        minute  = hours % 60 ;
        
        
        //hasil
        System.out.println(val + "Seconds is" + " " + minute + " " + "minutes" + " " + "and" +
                " " + seconds + " " + "seconds");
    }  
}
