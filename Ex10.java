package somenteADorColetiva;

public class Exercicio10 {
	public static void main(String[]args) {
		int[] numeros = {0,2,4,65,42,-2,78};
		for (int i : numeros) {
			if(i < 0) {
			break;	
			}else {
			System.out.println(i);
			}
		}
		
	}
}
