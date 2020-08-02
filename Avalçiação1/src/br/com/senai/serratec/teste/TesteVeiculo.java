package br.com.senai.serratec.teste;

import br.com.senai.serratec.Ipva;
import br.com.senai.serratec.Veiculo;

public class TesteVeiculo {
	public static void main(String[] args) {

		Ipva veiculo1 = new Ipva("Sandero", "lvc-5430", "gás", 55000.0, 125.0);
		Ipva veiculo2 = new Ipva("Fiesta", "Mvc-1212", "flex", 40000.0, 140.0);
		Ipva veiculo3 = new Ipva("Gol", "Lat", "gasolina", 50000.0, 150.0);

		veiculo1.calculaIpva();
		veiculo2.calculaIpva();
		veiculo3.calculaIpva();

		System.out.println("Veículo1: " + veiculo1 + " , Valor do IPVA: " + veiculo1.getValorIpva());
		System.out.println("Veículo2: " + veiculo2 + " , Valor do IPVA: " + veiculo2.getValorIpva());
		System.out.println("Veículo3: " + veiculo3 + " , Valor do IPVA: " + veiculo3.getValorIpva());

	}
}
