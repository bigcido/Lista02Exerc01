package view;
import controller.MultSom;

public class Principal {

	public static void main(String[] args) {
		MultSom ms = new MultSom();
		
		int a = 2;
		int b = 2;
		
		int fatsoma = ms.fatsoma(a, b);
		System.out.println(+fatsoma);

	}

}
