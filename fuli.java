package fuli;

import java.util.Scanner;

public class fuli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("请选择1.复利/2.单利：");
		int a = in.nextInt();
		if(a==1)
			Count.fulijisuan();
		else
			Count.danlijisuan();
		 
		  
		
		  }
	}

	
