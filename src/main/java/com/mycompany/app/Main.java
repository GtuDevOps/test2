package com.mycompany.app;
import java.io.*;
public class Main 
{
   	public static void main(String [] args){
		System.out.println("*****Fibonacci Series*****");
	}


  	public void fibonacci(int num){
		System.out.println("*****Fibonacci Series*****");
		int f1, f2=0, f3=1;
		for(int i=1;i<=num;i++){
			System.out.print(" "+f3+" ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
	}

}
