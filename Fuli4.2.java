package fuli3;

import java.util.Scanner;

public class Fuli {

		// TODO 自动生成的方法存根
	 // 复利计算：总额＝本金×(1+利率)^存期
		static void shouru(){
			Scanner in1=new Scanner(System.in);
			System.out.println("请输入本金：");
			double money =in1.nextDouble();  //本金
			System.out.println("请输入存款年数：");
			int years = in1.nextInt();    //存钱年数
			System.out.println("请输入利率：");
			float r = in1.nextFloat();   //利率
			float sum =1;
			//float sum = (float) ((1+r)*years*money); 
			   //System.out.println("存款总额为："+sum);
			for(int i = 1 ; i<=years; i++){
			sum = (float) (sum*(1+ r));  
				 }
			System.out.println("存款总额为："+sum*money);
		}
		
		
		static void benjin(){
			Scanner in1=new Scanner(System.in);
			System.out.println("请输入复利终值：");
			double sum =in1.nextDouble();  //本金
			System.out.println("请输入存款年数：");
			int years = in1.nextInt();    //存钱年数
			System.out.println("请输入利率：");
			float r = in1.nextFloat();   //利率
			//double money,n=1;
			//for(int i = 1 ; i<=years; i++){
			 //   n=(1+r)*n;
			//}
			//money = sum/n;
			float money=(float)( sum/(Math .pow(1+r,years)) );
			System.out.println("应投入本金为："+money);
		}
		
	
	    static void shijian(){
			Scanner in1=new Scanner(System.in);
			System.out.println("请输入本金：");
			double money =in1.nextDouble();  //本金
			System.out.println("请输入复利终值：");
			int sum = in1.nextInt();    //存钱年数
			System.out.println("请输入利率：");
			double r = in1.nextDouble();   //利率
			int years=(int)( sum/(Math .pow(1+r,money)) );
			System.out.println("应存储时间为："+years);
		}
		

	    static void lilv(){
			Scanner in1=new Scanner(System.in);
			System.out.println("请输入本金：");
			double money =in1.nextDouble();  //本金
			System.out.println("请输入存款年数：");
			int years = in1.nextInt();    //存钱年数
			System.out.println("请输入复利终值：");
			double sum = in1.nextDouble();   //终值
			float r=(float)( (Math.pow(sum/money, 1.0/years))-1 );
			System.out.println("报酬率应为："+r*100+"%");
		}
	    
	    static void dengehuankuan(){
			Scanner in1=new Scanner(System.in);
			System.out.println("请输入贷款金额：");
			double money =in1.nextDouble();
			System.out.println("请输入存款年数：");
			int years = in1.nextInt();  
			System.out.println("请输入利率：");
			double r = in1.nextDouble(); 
			double m;
			m=money*r/(12*(1+r)*(Math.pow(1+r,years)-1));
			System.out.println("每月等额还款金额为："+m+"元");
		}
	    
	    static void exit(){
				Scanner in1=new Scanner(System.in);
				System.out.println("感谢您使用复利计算软件.\n");
	    }

}
