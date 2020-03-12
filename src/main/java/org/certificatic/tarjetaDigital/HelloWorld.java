package org.certificatic.tarjetaDigital;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    
    /**
     * Creamos un método para que nos retorne una despedida con String
     */
    String sayBye(String nombre);
    
}

