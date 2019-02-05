package com.sergiorosa.ds.vector.test;

import com.sergiorosa.ds.vector.Vector;

public class app07 {

	public static void main(String[] args) {

		Vector vector = new Vector(10);

		vector.adiciona("B");
		vector.adiciona("C");
		vector.adiciona("E");
		vector.adiciona("F");
		vector.adiciona("G");

		System.out.println(vector);

		vector.adiciona(0, "A");

		System.out.println(vector);
		
		vector.adiciona(3, "D");

		System.out.println(vector);
	}

}
