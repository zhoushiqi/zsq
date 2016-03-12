package fuli;

//import java.util.Scanner;

public class Count {
static void fulijisuan()
		 {
			Scanner in1=new Scanner(System.in);
		 System.out.println("请输入本金：");
		double money =in1.nextDouble();  //本金
		System.out.println("请输入存款年数：");
		  int years = in1.nextInt();    //存钱年数
		 // System.out.println("请输入存款金额：");
		 // double sum=in.nextDouble();  //1存款总额
		  double sum=0;
		  System.out.println("请输入利率：");
		  double r = in1.nextDouble();   //利率
		  for(int i = 1 ; i<=years; i++){
		   sum = (1+ r) * i *money; 
		   System.out.println("存入第"+i+"年后的存款总额为："+sum);
		  }
		  
		  
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
