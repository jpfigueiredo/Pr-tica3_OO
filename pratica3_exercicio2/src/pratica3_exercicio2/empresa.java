package pratica3_exercicio2;

public class empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		fpadrao f1 = new fpadrao(123, "João", 1000);
		
		System.out.println(f1.toString());
		
		fcomissionado f2 = new fcomissionado(14, "Ana", 100, 500, 10);
		System.out.println(f2.toString());
		

	}

}
