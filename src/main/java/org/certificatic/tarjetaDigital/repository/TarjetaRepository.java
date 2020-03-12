package org.certificatic.tarjetaDigital.repository;

import java.util.List;

import org.certificatic.tarjetaDigital.model.Tarjeta;

public interface TarjetaRepository {//simulamos la conexion a la bbdd
	//es una clase abstracta donde definimos contratos
	//creamos 2 metodos 1.- crea la tarjeta, 2.- lista todas las tarjetas
	/**
	 * Metodo para crear una tarjeta nueva 
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);//1.- metodo
	
	/**
	 * Metodo para obtener todas las tarjetas
	 * @return todas las tarjetas
	 */
	List<Tarjeta> obtenerTodas();//2.- seg metodo
}
