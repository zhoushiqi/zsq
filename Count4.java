package fuli3;

import java.util.Scanner;

public class Count {

		// TODO 自动生成的方法存根
		static void fulijisuan(){
		Scanner in=new Scanner(System.in);
		System.out.println("请选择1.计算收入/2.计算本金/3.计算时间/4.计算利率/5.复利条件下等额还款金额：");
		int a = in.nextInt();
		if(a==1)
			Fuli.shouru();
		else if(a==2)
			Fuli.benjin();
		else if(a==3)
			Fuli.shijian();
		else if(a==4)
			Fuli.lilv();
		else if(a==5)
			Fuli.dengehuankuan();
	  }
	 
	  

	static void danlijisuan(){
	Scanner in1=new Scanner(System.in);
	double sum=0;
	System.out.println("请输入本金：");
	double money =in1.nextDouble();  //本金
	System.out.println("请输入存款年数：");
	int years = in1.nextInt();    //存钱年数
	System.out.println("请输入利率：");
	double r = in1.nextDouble();   //利率
	for(int i = 1 ; i<=years; i++){
	   sum = (1+ r * i )*money; 
	   System.out.println("当前所需本金："+sum);
	}
    }
	

}
