package fuli3;

import java.util.Scanner;

public class Count {

		// TODO �Զ����ɵķ������
		static void fulijisuan(){
		Scanner in=new Scanner(System.in);
		System.out.println("��ѡ��1.��������/2.���㱾��/3.����ʱ��/4.��������/5.���������µȶ���");
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
