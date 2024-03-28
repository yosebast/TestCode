package com.example.demo.pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FactoryConexion {
	
	static Conexion findConexion(String bbdd) {
		
		if (bbdd == null) {
			return new ConexionVacia();
		}
		
		if (bbdd.equals("Oracle")) {
			
			return new OracleConexion();
			
		}else if(bbdd.equals("Db2")) {
			
			return new Db2Conexion();
			
		}else if(bbdd.equals("Msql")) {
			
			return new MsqlConexion();
			
		}else {
			return new ConexionVacia();
		}
	}
	
	public String getData() {
		return "exito";
	}
	

}
