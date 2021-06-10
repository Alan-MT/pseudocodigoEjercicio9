import java.util.*;

public class Ejercicio9 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int conta = 0;
		int sumat = 0;
		int t1 = 0;
		int t2 = 0;
		do {
			System.out.println("Ingrese la primera temperatura");
			t1 = sca.nextInt();
			if (t1 != 0) {
				System.out.println("Ingrese la segunda temperatura");
				t2 = sca.nextInt();
				if (t1<=15 && t1>=5) {
					sumat = sumat+t1;
					conta ++;
				}
				if (t2<=15 && t2>=5) {
					sumat = sumat+t2;
					conta ++;
				}
			} else {
				double promedio = sumat/conta;
				System.out.println("Promedio de temperatura entre 5� y 15�: "+promedio);
			}
		} while (t1!=0);
	}


}

