package org.certificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.model.Tarjeta;
import org.certificatic.tarjetaDigital.repository.TarjetaRepository;
import org.certificatic.tarjetaDigital.repository.TarjetaRepositoryImpl;

//creamos una clase de implementacion para implementar
//tarjeta service
//es un punto final en el cual va a ejecutar la funcion
@WebService(endpointInterface="org.certificatic.tarjetaDigital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService {
	//implementacion por que se especifica su especialidad
	//generamos un objeto del servicio de repository
	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();//esto en spring ya no se usa 
	//se usa una anotacion @Autoware para inyectar el bean
	//referenciamos la interface la implementacion
	//implementamos los metodos
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		return tarjetaRepository.obtenerTodas();
	}

	
	
	
}
