package sample2;

public class Sample202 {
	
	public static void main (String[] args) {
		
		int a;
		int b = 3;
		int add,sub;
		double avg;
		
		a = 6;
		add = a + b;
		sub = a - b;
		avg = (a + b) / 2.0;
		
		System.out.println(a + " + " + b + " = " + add);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println("aとbの平均値:" + avg);
		System.out.println(a + "と" + b + "の平均値:" + avg);
	}
}