import java.util.Scanner;

public class VarAbsoluto {

	public static void main(String[] args) {
		/**
		* Escribir un programa que pida un número al usuario y muestre
		* su valor absoluto
		*
		*/

		int num;

		Scanner sc= new Scanner(System.in);

		System.out.println("Digite el número");
		num= sc.nextInt();

		/*
		* se crea otra variable donde va a guardar el valor absoluto con la
		* operación ternaria.
		*/

		int valab;

		/**
		* recuerda que el valor absoluto de un número es que el
		* numero sea negativo o positivo va a dar un valor en positivo
		*/

		valab= num>0? num:-num;

		/**
		* Recuerda la ley de los signos que indica que si un número es positivo
		* y otro es negativo se restan y se mantiene el signo de la cifra mayor
		*/

		System.out.println(valab);

		/**
		* Otra cosa en relación con la ley de los signos, el operador ternario y
		* el valor absoluto es que el resultado lo va a cambiar a positivo
		* es que su valor.
		*/

		
		
		
		
		
	}

}
