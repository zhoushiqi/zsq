package fuli;

import java.util.Scanner;

public class fuli {
	 public static void main(String[] args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("请输入本金：");
		double money =in.nextDouble();  //本金
		System.out.println("请输入存款年数：");
		  int years = in.nextInt();    //存钱年数
		  System.out.println("请输入存款金额：");
		  double sum=in.nextDouble();  //存款总额
		  System.out.println("请输入利率：");
		  double r = in.nextDouble();   //利率
		  for(int i = 1 ; i<=years; i++){
		   sum = (1+ r) * i *money; 
		   System.out.println("存入第"+i+"年后的存款总额为："+sum);
		  }
		 }
}
