package org.certificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.model.Tarjeta;
@WebService
public interface TarjetaService {
	//la Interface es el contrato
	//pegamos los metodos del repository con la diferencia que 
	//ponemos la anotacion @webService
	//para saber que esta interface va a estar
	//publicada como un web service
	/**
	 * Metodo para crear una tarjeta nueva 
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);//1.- metodo
	//o contrato
	/**
	 * Metodo para obtener todas las tarjetas
	 * @return todas las tarjetas
	 */
	List<Tarjeta> obtenerTodas();//2.- seg metodo
	//o contrato
}
