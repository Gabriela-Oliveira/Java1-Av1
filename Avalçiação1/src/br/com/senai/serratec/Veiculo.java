package br.com.senai.serratec;

public class Veiculo {

	protected String modelo;
	protected String placa;
	protected String combustivel;
	protected double valorVeiculo;

	public Veiculo(String modelo, String placa, String combustivel, double valorVeiculo) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.combustivel = combustivel;
		this.valorVeiculo = valorVeiculo;

	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", placa=" + placa + ", combustivel=" + combustivel + ", valorVeiculo="
				+ valorVeiculo + "]";
	}

}
