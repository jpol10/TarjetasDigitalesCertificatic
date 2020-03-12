
package org.certificatic.tarjetaDigital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certificatic.tarjetaDigital.HelloWorld")//notacion webservice para generar un saludo
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    //creamos otro contrato para la interface
	@Override
	public String sayBye(String nombre) {
		return "Adios:  "+ nombre;
	}
}

