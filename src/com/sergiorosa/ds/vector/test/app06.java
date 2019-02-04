package com.sergiorosa.ds.vector.test;

import com.sergiorosa.ds.vector.Vector;

public class app06 {

	public static void main(String[] args) {
		
		Vector vector = new Vector(10);

		vector.adiciona("Curso 1");
		vector.adiciona("Java ds 2");
		vector.adiciona("elemento 3");

		System.out.println(vector.busca("Curso 1"));
		System.out.println(vector.busca("Curso 4"));
	}

}
