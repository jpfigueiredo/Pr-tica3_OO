package pratica3_exercicio1;

public class camarote extends ingresso{
	
	private double localizacao;
	private double valor_adcional;
	
	
public void setlocalizacao (double localizacao) {
		
		this.localizacao = localizacao;	
}

public double getlocalizacao () {
	
	return localizacao;

}

public void setvalor_adcional (double valor_adcional) {
	
	this.valor_adcional = valor_adcional;	
}

public double getvalor_adcional () {

return valor_adcional;

}



	
public camarote(double valor, double valor_adcional, double localizacao){
		
		super(valor);
		this.valor_adcional = valor_adcional;
		
	}

public void imprime_ingressovalor() {
	System.out.println("Ingresso Camarote: " + (getvalor() + getvalor_adcional() + "Localização:" + getlocalizacao());
	
}

	
	
	
	
}
