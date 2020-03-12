package org.certificatic.tarjetaDigital.repository;

import java.util.ArrayList;
import java.util.List;
//creamos la implementacion con una clase de java
import org.certificatic.tarjetaDigital.model.Tarjeta;
//implementamos tarjetarepository 
//al implementar una interface nos obliga a pponer todos los contratos
public class TarjetaRepositoryImpl implements TarjetaRepository {

	//ceamos una lista estatica de las tarjetas, retorna en la lista
	private static List<Tarjeta> tarjetasDigitales =
			new ArrayList<>();
	//contratos de la Interface
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		// imprimimos un mesaje
		System.out.println("Crear Tarjeta::::");
		//adherimos la tarjeta
		tarjetasDigitales.add(tarjeta);
		//retorna la tarjeta
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// Imprimie un mensaje obtener toas las tarjetas
		System.out.println(":::Obtener todas las tarjetas");
		// retornamos toda las tarjetas digitales
		return tarjetasDigitales;
	}

	
	//capa de repository es puro acceso a bbdd
	
}
