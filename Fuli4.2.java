package fuli3;

import java.util.Scanner;

public class Fuli {

		// TODO �Զ����ɵķ������
	 // �������㣺�ܶ�����(1+����)^����
		static void shouru(){
			Scanner in1=new Scanner(System.in);
			System.out.println("�����뱾��");
			double money =in1.nextDouble();  //����
			System.out.println("��������������");
			int years = in1.nextInt();    //��Ǯ����
			System.out.println("���������ʣ�");
			float r = in1.nextFloat();   //����
			float sum =1;
			//float sum = (float) ((1+r)*years*money); 
			   //System.out.println("����ܶ�Ϊ��"+sum);
			for(int i = 1 ; i<=years; i++){
			sum = (float) (sum*(1+ r));  
				 }
			System.out.println("����ܶ�Ϊ��"+sum*money);
		}
		
		
		static void benjin(){
			Scanner in1=new Scanner(System.in);
			System.out.println("�����븴����ֵ��");
			double sum =in1.nextDouble();  //����
			System.out.println("��������������");
			int years = in1.nextInt();    //��Ǯ����
			System.out.println("���������ʣ�");
			float r = in1.nextFloat();   //����
			//double money,n=1;
			//for(int i = 1 ; i<=years; i++){
			 //   n=(1+r)*n;
			//}
			//money = sum/n;
			float money=(float)( sum/(Math .pow(1+r,years)) );
			System.out.println("ӦͶ�뱾��Ϊ��"+money);
		}
		
	
	    static void shijian(){
			Scanner in1=new Scanner(System.in);
			System.out.println("�����뱾��");
			double money =in1.nextDouble();  //����
			System.out.println("�����븴����ֵ��");
			int sum = in1.nextInt();    //��Ǯ����
			System.out.println("���������ʣ�");
			double r = in1.nextDouble();   //����
			int years=(int)( sum/(Math .pow(1+r,money)) );
			System.out.println("Ӧ�洢ʱ��Ϊ��"+years);
		}
		

	    static void lilv(){
			Scanner in1=new Scanner(System.in);
			System.out.println("�����뱾��");
			double money =in1.nextDouble();  //����
			System.out.println("��������������");
			int years = in1.nextInt();    //��Ǯ����
			System.out.println("�����븴����ֵ��");
			double sum = in1.nextDouble();   //��ֵ
			float r=(float)( (Math.pow(sum/money, 1.0/years))-1 );
			System.out.println("������ӦΪ��"+r*100+"%");
		}
	    
	    static void dengehuankuan(){
			Scanner in1=new Scanner(System.in);
			System.out.println("����������");
			double money =in1.nextDouble();
			System.out.println("��������������");
			int years = in1.nextInt();  
			System.out.println("���������ʣ�");
			double r = in1.nextDouble(); 
			double m;
			m=money*r/(12*(1+r)*(Math.pow(1+r,years)-1));
			System.out.println("ÿ�µȶ����Ϊ��"+m+"Ԫ");
		}
	    
	    static void exit(){
				Scanner in1=new Scanner(System.in);
				System.out.println("��л��ʹ�ø����������.\n");
	    }

}
