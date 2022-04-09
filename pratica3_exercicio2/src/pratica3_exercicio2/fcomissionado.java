package pratica3_exercicio2;

public class fcomissionado extends funcionario{

	private double percentual;
	private double vendas;
	
	
	public fcomissionado(int matricula, String nome, double salario, double percentual, double vendas) {
		super(matricula, nome, salario);
		this.percentual = percentual;
		this.vendas = vendas;
	}


	public double getPercentual() {
		return percentual;
	}


	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}


	public double getVendas() {
		return vendas;
	}


	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	
	public double calcularproventos() {
		return getSalario()+ (this.vendas*this.percentual/100);
	}
	
	
	
	
	
	
}
