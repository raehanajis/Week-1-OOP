/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class No2 {
    
       public static void main(String[] args) {
        
           Scanner input = new Scanner(System.in);
           
                //List Hari
                   System.out.println("1"+" "+"Senin");
                   System.out.println("2"+" "+"Selasa");
                   System.out.println("3"+" "+"Rabu");
                   System.out.println("4"+" "+"Kamis");
                   System.out.println("5"+" "+"Jumat");
                   System.out.println("6"+" "+"Sabtu");
                   System.out.println("7"+" "+"Minggu");
                   
		// user menginput Hari dengan list yang tersedia 
		System.out.print("Masukan no hari : ");
		int day = input.nextInt();

		// user menginput jumlah hari yang di inginkan 
		System.out.print("Menambahkan Jumlah hari : ");
		int Tambah = input.nextInt();

		// Menghitung Jumlah hari dan hasilnya
		int Nextday = (day + Tambah) % 14 ;

		System.out.print("Hari ini ");
		switch (day)
		{
			case 1: System.out.print("Senin"); break;
			case 2: System.out.print("Selasa"); break;
			case 3: System.out.print("Rabu"); break;
			case 4: System.out.print("Kamis"); break;
			case 5: System.out.print("Jumat"); break;
			case 6: System.out.print("Sabtu"); break;
			case 7: System.out.print("Minggu");
		}
                
		System.out.print(" dan hari " + Tambah + " " + "adalah" + " " );
		switch (Nextday)
		{
			case 1: System.out.println("Senin"); break;
			case 2: System.out.println("Selasa"); break;
			case 3: System.out.println("Rabu"); break;
			case 4: System.out.println("Kamis"); break;
			case 5: System.out.println("Jumat"); break;
			case 6: System.out.println("Sabtu"); break;
			case 7: System.out.println("Minggu");
		}

    }
    
}
