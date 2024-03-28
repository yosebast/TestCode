package com.example.demo.pattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Db2Conexion implements Conexion {

	
	private String host;
	private int port;
	private String user;
	private String password;
	
	
	public Db2Conexion() {
		
		this.host = "HOSTDB2";
		this.port = 7777;
		this.user = "db2";
		this.password = "454545";
	}
	
	@Override
	public void conectar() {
		log.info("conectar a Db2");

	}

	@Override
	public void desconectar() {
		log.info("desconectar de Db2");

	}

}
