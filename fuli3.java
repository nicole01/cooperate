package fuli3;

import java.util.Scanner;

public class fuli3 {
		static double a=0;
		static double b=0;
		static double c=0;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������	

		
		System.out.println("��ѡ��1.��ѯ/2.Ͷ�ʣ�");
		Scanner in=new Scanner(System.in);
		int g = in.nextInt();
		if(g==1)
			chaxun();
		else
			touzi();


}	
		private static void touzi() {
		// TODO �Զ����ɵķ������
			Scanner in=new Scanner(System.in);
		System.out.println("������Ͷ��������");
		int n = in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("��"+i+"���ʽ�");
			System.out.println("��ѡ��1.����/2.������");
		int m = in.nextInt();
		if(m==1)
			Fuli.shouru(a,b,c);
		else
			Count.danlijisuan(a, b, c);		
		}
	Scanner in1=new Scanner(System.in);
	System.out.println("��ѡ��1.����/2.������");
	}
		private static void chaxun() {
		// TODO �Զ����ɵķ������
				Scanner in=new Scanner(System.in);
		System.out.println("������Ͷ��������");
		int n = in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("��"+i+"���ʽ�");
			System.out.println("��ѡ��1.����/2.������");
		int m = in.nextInt();
		if(m==1)
			Count.fulijisuan(a, b, c);
			Count.danlijisuan(a, b, c);		
		}
	Scanner in1=new Scanner(System.in);
	System.out.println("��ѡ��1.����/2.������");
	}
	
		
		
	
}