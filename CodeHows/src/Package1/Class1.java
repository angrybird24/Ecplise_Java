package Package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Class1 {
	static public void  main(String[] args) {   
		String [] aa ={"영작문 : ","프로그래밍 : " , "이산수학 : " , "컴퓨터구조 : "};
	    String [] bb ={"영작문 과목점수 : " , "프로그래밍 과목점수 : ", "이산수학 과목점수 : ","컴퓨터구조 과목점수 : "};
		Scanner sc = new Scanner(System.in);
		double a = 0;
		ArrayList<Double> arrayList = new ArrayList<Double>(); 
		for(int i=0; i<4; i++) {
			 System.out.print(aa[i]);
			 double num = sc.nextDouble();  
			 arrayList.add(num);
			 a+= num;
		}
		
		for(int i=0; i<4; i++) {
			System.out.print(bb[i] + arrayList.get(i)+"\n");
		}
		System.out.println("평균점수 : "+a/arrayList.size());
		
	}
}