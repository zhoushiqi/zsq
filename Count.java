package fuli;

//import java.util.Scanner;

public class Count {
static void fulijisuan()
		 {
			Scanner in1=new Scanner(System.in);
		 System.out.println("�����뱾��");
		double money =in1.nextDouble();  //����
		System.out.println("��������������");
		  int years = in1.nextInt();    //��Ǯ����
		 // System.out.println("���������");
		 // double sum=in.nextDouble();  //1����ܶ�
		  double sum=0;
		  System.out.println("���������ʣ�");
		  double r = in1.nextDouble();   //����
		  for(int i = 1 ; i<=years; i++){
		   sum = (1+ r) * i *money; 
		   System.out.println("�����"+i+"���Ĵ���ܶ�Ϊ��"+sum);
		  }
		  
		  
		 }
		  static void danlijisuan(){
			Scanner in1=new Scanner(System.in);
			double sum=0;
		 System.out.println("�����뱾��");
		double money =in1.nextDouble();  //����
		System.out.println("��������������");
		  int years = in1.nextInt();    //��Ǯ����
		  System.out.println("���������ʣ�");
		  double r = in1.nextDouble();   //����
		  for(int i = 1 ; i<=years; i++){
		   sum = (1+ r * i )*money; 
		   System.out.println("��ǰ���豾��"+sum);
		  }
		  }
}
