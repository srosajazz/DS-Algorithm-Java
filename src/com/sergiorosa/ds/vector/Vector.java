package com.sergiorosa.ds.vector;

import java.util.Arrays;

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
	
	// 0 1 2 3 4 5 6 = tamnaho e 5
	// B C E F G + +
	//Add element in any place in the array
	public boolean adiciona(int posicao, String elemento) {
		
		//1: check if the position is envalida
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao e ivalida.");
		}
		//2: Logica em mover todos os elementos
		for(int i = this.tamanho-1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
		//this.tamanho-1 is = 4
		//primeira passada no for o i vai valer (4).
		// i=4
		
	}

	// Obter elemento de Arrays em uma posição
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao nao encontrada.");
		} else {
			return this.elementos[posicao];
		}
		
	}
	
	//Check if element exist in array : True/False
		public int busca(String elemento){
			for (int i=0; i < this.tamanho; i++) {
				if (this.elementos[i].equals(elemento)) {
					return i;
				}
			}
			return -1;
		}
	

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(" , ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[tamanho - 1]);
		}

		s.append("]");

		return s.toString();
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

/*
 * public void adiciona(String elemento) throws Exception {
 * 
 * if (this.tamanho < this.elementos.length) { this.elementos[this.tamanho] =
 * elemento; this.tamanho++; } else { throw new
 * Exception("Vector is full, is not possible to add more elementos in the Vector."
 * ); } }
 */
