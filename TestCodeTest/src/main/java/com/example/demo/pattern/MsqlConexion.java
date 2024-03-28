package com.example.demo.pattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class MsqlConexion implements Conexion {

	
	private String host;
	private int port;
	private String user;
	private String password;
	
	
	public MsqlConexion() {
		
		this.host = "HOSTMSQL";
		this.port = 4444;
		this.user = "msql";
		this.password = "88888";
	}
	
	@Override
	public void conectar() {
		log.info("conectar a Msql");
	}

	@Override
	public void desconectar() {
		log.info("desconectar de Msql");
	}

}
