package com.in28minutes.firstjavaproject;

public class MultiplicationTableRunner {

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.print();
		table.print(6);

		// public method로 설정했음
//		for (int i = 2; i < 10; i++) {			
//			MultiplicationTable.print(i);
//		}

		table.print(5, 11, 20);
		System.out.println((Math.floorDiv(2000, 100)));

	}
}
