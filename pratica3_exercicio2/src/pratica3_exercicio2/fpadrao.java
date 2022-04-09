package pratica3_exercicio2;

public class fpadrao extends funcionario {

	public fpadrao(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	

	public double calculaproventos() {

		return getSalario();
		
	}
	
	
}
