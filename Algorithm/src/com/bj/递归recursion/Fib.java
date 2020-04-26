package com.bj.递归recursion;



public class Fib {
	public static void main(String[] args){
		Fib fib = new Fib();
		int n = 10;
		Times.test("fib0", () -> {
			System.out.println(fib.fib1(n));
		});
		Times.test("fib1", () -> {
			System.out.println(fib.fib1(n));
		});
		Times.test("fib2", () -> {
			System.out.println(fib.fib1(n));
		});
		Times.test("fib3", () -> {
			System.out.println(fib.fib1(n));
		});
		Times.test("fib4", () -> {
			System.out.println(fib.fib1(n));
		});
		
		Times.test("fib5", () -> {
			System.out.println(fib.fib1(n));
		});
		Times.test("fib6", () -> {
			System.out.println(fib.fib1(n));
		});
		
		
	}
	
	int fib0(int n) {
		if(n<=2) return 1;
		return fib0(n-1)+fib0(n-2);
	}
	
	
	int fib1(int n) {
		if(n<=2) return 1;
		int [] array = new int[n+1];
		array[2] =array[1]=1;
		return fib1(n,array);
	}
	int fib1(int n, int[] array) {
		if(array[n] == 0) {
			array[n] = fib1(n-1, array)+fib1(n-2, array);
		}
		return array[n];
	}
	
	int fib2(int n) {
		if(n<=2) return 1;
		int array[] = new int[n+1];
		array[2] = array[1] =1;
		for(int i = 3; i<=n;i++) {
			array[i] = array[i-1] + array[i-2];
		}
		return array[n];
	}
	
	int fib3(int n) {
		if(n<=2) return 1;
		int array[] = new int[2];
		array[0] = array[1] =1;
		for(int i = 3; i<=n;i++) {
			array[i % 2] = array[(i-1)%2] + array[(i-2)%2];
		}
		return array[n % 2];
	}
	
	int fib4(int n) {
		if (n <= 2) return 1;
		int[] array = new int[2];
		array[0] = array[1] = 1;
		for (int i = 3; i <= n; i++) {
			array[i & 1] = array[(i - 1) & 1] + array[(i - 2) & 1];
		}
		return array[n & 1];
	}

	int fib5(int n) {
		if(n<=2) return 1;
		int first = 1;
		int second = 1;
		for(int i=3;i<=n;i++) {
			second = first +second;
			first = second - first;
		}
		return second;
	}
	
	int fib6(int n) {
		double c = Math.sqrt(5);
		return (int) ((Math.pow((1+c)/2, n) - Math.pow((1-c)/2, n))/c);
	} 
}
