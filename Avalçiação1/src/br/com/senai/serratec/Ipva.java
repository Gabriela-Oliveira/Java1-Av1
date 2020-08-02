package br.com.senai.serratec;

public class Ipva extends Veiculo {

	private double valorIpva;
	private double taxaLicenciamento;

	public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
		super(modelo, placa, combustivel, valorVeiculo);
		this.valorIpva = valorIpva;
		this.taxaLicenciamento = taxaLicenciamento;
	}

	public double getValorIpva() {
		return valorIpva;
	}

	public void calculaIpva() {
		if (combustivel.equals("gás")) {
			valorIpva = (valorVeiculo * 0.01) + taxaLicenciamento;
		} else if (combustivel.equals("flex")) {
			valorIpva = (valorVeiculo * 0.03) + taxaLicenciamento;
		} else {
			valorIpva = (valorVeiculo * 0.04) + taxaLicenciamento;
		}

	}

	@Override
	public String toString() {
		return " Modelo= " + modelo + ", Placa= " + placa + ", Combustivel= " + combustivel + ", ValorVeiculo= "
				+ valorVeiculo + " TaxaLicenciamento= " + taxaLicenciamento;
	}

}
