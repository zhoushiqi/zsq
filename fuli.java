package fuli;

import java.util.Scanner;

public class fuli {
	 public static void main(String[] args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("�����뱾��");
		double money =in.nextDouble();  //����
		System.out.println("��������������");
		  int years = in.nextInt();    //��Ǯ����
		  System.out.println("���������");
		  double sum=in.nextDouble();  //����ܶ�
		  System.out.println("���������ʣ�");
		  double r = in.nextDouble();   //����
		  for(int i = 1 ; i<=years; i++){
		   sum = (1+ r) * i *money; 
		   System.out.println("�����"+i+"���Ĵ���ܶ�Ϊ��"+sum);
		  }
		 }
}
