package controller;

public class MultSom {

	public MultSom() {
		super();
	}
	
	public int fatsoma(int a, int b){
		//se o fator for igual a zero, retorna a zero e zero na soma não altera o "a"
		if (b == 0) {
			return 0;
		} else {
			//se o fator não for igual a zero ele vai chamar a função (b-1x) e somar com a.
			return a + fatsoma(a, b-1);
		}
	}
}


/*ex = 5*4 = 20 == 5 + 5 + 5 + 5, ou seja, pra dar 20, soma-se 5 4 vezes.
 */ 
