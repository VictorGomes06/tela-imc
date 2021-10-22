package br.senai.sp.jandira.model;

public class Imc {

	private double peso;
	private double altura;
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = Double.parseDouble(peso);
	}
	
	public double calcularImc() {
		double imc = peso / Math.pow(altura,2);
		return imc;
	}
	
	public String mostrarImcComoString() {
		return String.valueOf(calcularImc());
	}
	
	
	
	public String mostrarStatusImc() {
		if (calcularImc() < 18.5) {
			return "abaixo do peso !";
		}
		
		else if (calcularImc() >= 18.5 && calcularImc() <= 24.5){
			return "Peso ideal (PAARBÉNS !!)";
			
		}
		else if (calcularImc() >= 25 && calcularImc() <30) {
			return "Levemente acima do peso";
		}
		else if (calcularImc() >= 30 && calcularImc() < 35 ) {
			return "Obesdade Grau I";
		}
		else if (calcularImc() >= 35 && calcularImc() < 40 ) {
			return "Obesidade Grau II";
		}
		else {
			return "Obesidade Grau III";
		}
	}
	
}
