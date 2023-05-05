package com.java.study;

public class JavaStudy {
	public static void main(String args[]) {
		Tv tv; //변수 선언, 객체 생성
		tv = new Tv();
		
		Tv t2 = new Tv();
		t2.channel = 7;
		
//		tv.channel = 7; //변수사용
//		tv.channelDown(); //메서드 사용 = 메서드 호출
		
		int[] numArr = null;
		for(int i=0; i<10;i++)
			numArr[i]=(int)(Math.random()*10);
		printArr(numArr);
		
		
		
		
		
		MyMath mm = new MyMath();
		long result1= mm.add(5L,3L);
		
		
		
		
		Card c1=new Card();
		c1.kind="heart";//
		c1.number=1;
		c1.width=50;
		c1.height=50;
		
		
		System.out.println(MyMath.add(200L,300L));// 클래스 메서드 호출
		mm.a = 200L;
		mm.b=300L;
		System.out.println(mm.add()); //인스턴스 메서드 호출
		
		
	}
	static void printArr(int[] numArr) {
		for(int i=0; i<10;i++)
			System.out.printf("%d",numArr[i]);
		System.out.println();
	}
	
	
	
	
	

}

class Tv{
	
	String color;
	boolean power;
	int channel;
	
	//메서드 3개
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}	

class MyMath{
	
	long a,b;
	long add() { //인스턴스 메서드
		return a+b;
	}
	static long add(long a, long b) { //클래스 메서드
		
		return  a+b;
	}
}

class Card{
	String kind;
	int number;
	static int width=100;
	static int height = 250;
}




