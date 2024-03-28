package com.example.demo.pattern;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.StringUtils;

@Slf4j
public class CreateConexion {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CreateConexion.class);
//
	public static void main(String[] args) {
//		
//		FactoryConexion fc = new FactoryConexion();
//		
//		Conexion cnn = fc.findConexion("Oracle");
//		log.info(cnn.toString());
//		cnn.conectar();
//		
//		//get the parameters of conexion to Oracle DataBase		
//		OracleConexion oracle = new OracleConexion();		
//		List<String> lista = List.of("The connection data is", oracle.getHost(), String.valueOf(oracle.getPort()), oracle.getUser(), oracle.getPassword());		
//		log.info(StringUtils.join(lista, Character.valueOf(',')));
//		
//		Conexion cnn2 = fc.findConexion("Db2");
//		cnn2.conectar();
//		
//		Conexion cnn3 = fc.findConexion("Msql");
//		cnn3.conectar();
//
		
		// esto demuestra que un metodo estatico se puede usar para obtener la implementacion de una interfaz
		FactoryConexion fc = new FactoryConexion();
		fc.getData();
		
		Conexion cnn = FactoryConexion.findConexion("Oracle");
		/////
		
	}


}
