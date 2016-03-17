package fuli3;

import java.util.Scanner;

public class fuli3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		System.out.println("请选择1.复利/2.单利：");
		int a = in.nextInt();
		if(a==1)
			Count.fulijisuan();
		else
			Count.danlijisuan();;
	}

}
