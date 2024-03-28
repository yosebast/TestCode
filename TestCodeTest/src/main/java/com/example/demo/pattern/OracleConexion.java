package com.example.demo.pattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class OracleConexion  implements Conexion {
	
	
	private String host;
	private int port;
	private String user;
	private String password;
	
	public OracleConexion() {
		
		this.host = "HOSTORACLE";
		this.port = 5689;
		this.user = "name";
		this.password = "123456";
	}

	@Override
	public void conectar() {		
		log.info("conectar a Oracle");
	}

	@Override
	public void desconectar() {
		log.info("desconectar de Oracle");		
	}

}
