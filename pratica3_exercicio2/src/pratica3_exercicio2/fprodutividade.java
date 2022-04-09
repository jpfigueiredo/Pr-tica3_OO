package pratica3_exercicio2;

public class fprodutividade extends funcionario {
	
	private double valor;
	private double producao;
	
	public fprodutividade(int matricula, String nome, double salario, double valor, double producao) {
		super(matricula, nome, salario);
		this.valor = valor;
		this.producao = producao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getProducao() {
		return producao;
	}

	public void setProducao(double producao) {
		this.producao = producao;
	}
	
	public double calcularproventos() {
		
		return getSalario()+ (this.valor*this.producao);		
	}
	

    public String toString(){
		
		return "Nome: " + getNome() + "Salario: " + calcularproventos();
		
		
	}
	
	
	
}
