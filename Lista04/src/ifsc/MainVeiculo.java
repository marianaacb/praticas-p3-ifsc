package ifsc;

import java.net.PortUnreachableException;
import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {

		Veiculo carro = new Veiculo();
		
		carro.setNome("Carro1");
		carro.setAno(2023);
		carro.setNumRodas(4);
		carro.setFabricante("Empresa1");
		carro.setCor("Verde");

		
		Veiculo moto = new Veiculo();
		moto.setNome("Moto2");
		moto.setAno(2022);
		moto.setNumRodas(2);
		moto.setFabricante("Empresa2");
		moto.setCor("Azul");

		
		Veiculo bike = new Veiculo();
		bike.setNome("Bike3");
		bike.setAno(2021);
		bike.setNumRodas(2);
		bike.setFabricante("Empresa3");
		bike.setCor("Amarelo");
		

		
		ArrayList<Veiculo> lista = new ArrayList<>(3);

		lista.add(carro);
		lista.add(moto);
		lista.add(bike);

		for (Veiculo veiculo : lista) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumRodas());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
		}

	}
}
