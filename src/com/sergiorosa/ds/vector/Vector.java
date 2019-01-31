package com.sergiorosa.ds.vector;

public class Vector {

	private String[] elementos; // option#1
	private int tamanho;

	public Vector(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;

	}

	public boolean adiciona(String elemento) {
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;	
			return true;
		}
		return false; 
	}
}



//Options to add elements in the array.
// Add element in end of the Vector (Option#1)
/*
 * public void adiciona(String elemento) { for(int i=0; i<this.elementos.length;
 * i++) { if(this.elementos[i] == null) { this.elementos[i]= elemento; break; }
 * 
 * } }
 */

/*public void adiciona(String elemento) throws Exception {

	if (this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	} else {
		throw new Exception("Vector is full, is not possible to add more elementos in the Vector.");
	}
}*/
