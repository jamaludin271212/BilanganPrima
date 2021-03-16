package com.juarakoding.bil.prima;

import java.util.Iterator;
import java.util.Scanner;

public class cekBilanganPrima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan Angka: ");
		  
		int x = scan.nextInt();
		  
		int temp;
		boolean prima = true;
		  
		//penggunaan for loop
		for(int pembagi = 2; pembagi <= x / 2; pembagi++){
		   
		temp = x % pembagi;
		   
		 if(temp == 0){
			 prima = false;
			 break;
		   }
		  
		  }
		  
		  /*
		   Jika prima adalah true dan angka yang diberikan user
		   bukanlah 0 dan 1
		   */
		  if(prima && ((x > 0)&&(x != 1)))
		   System.out.println(x + " adalah bilangan prima");
		  else
		   System.out.println(x + " bukanlah bilangan prima");
		  
	}

}
