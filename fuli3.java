package fuli3;

import java.util.Scanner;

public class fuli3 {
		static double a=0;
		static double b=0;
		static double c=0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根	

		
		System.out.println("请选择1.查询/2.投资：");
		Scanner in=new Scanner(System.in);
		int g = in.nextInt();
		if(g==1)
			chaxun();
		else
			touzi();


}	
		private static void touzi() {
		// TODO 自动生成的方法存根
			Scanner in=new Scanner(System.in);
		System.out.println("请输入投资数量：");
		int n = in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("第"+i+"笔资金：");
			System.out.println("请选择1.复利/2.单利：");
		int m = in.nextInt();
		if(m==1)
			Fuli.shouru(a,b,c);
		else
			Count.danlijisuan(a, b, c);		
		}
	Scanner in1=new Scanner(System.in);
	System.out.println("请选择1.复利/2.单利：");
	}
		private static void chaxun() {
		// TODO 自动生成的方法存根
				Scanner in=new Scanner(System.in);
		System.out.println("请输入投资数量：");
		int n = in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("第"+i+"笔资金：");
			System.out.println("请选择1.复利/2.单利：");
		int m = in.nextInt();
		if(m==1)
			Count.fulijisuan(a, b, c);
			Count.danlijisuan(a, b, c);		
		}
	Scanner in1=new Scanner(System.in);
	System.out.println("请选择1.复利/2.单利：");
	}
	
		
		
	
}