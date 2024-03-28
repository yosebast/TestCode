package com.example.demo.pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConexionVacia implements Conexion {

	@Override
	public void conectar() {
		log.info("conexion vacia");
		
	}

	@Override
	public void desconectar() {
		log.info("desconexion vacia");
		
	}
	
	

}
