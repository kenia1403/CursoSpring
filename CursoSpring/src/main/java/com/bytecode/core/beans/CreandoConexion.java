package com.bytecode.core.beans;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;


import com.bytecode.core.model.Conexion;
import com.bytecode.core.model.Usuario;

@Component
public class CreandoConexion {
	@Bean (name = "beanUsuario")
	public Usuario getUsuario() {
		return new Usuario();
	}
	
	@Bean (name = "beanConexion")
	public Conexion getConexion(){
		Conexion conexion= new Conexion();
		conexion.setDb("mysql");
		conexion.setUrl("localhost");
		return conexion;
	}
	
	@Bean 
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/blog/jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\r\n");
		dataSource.setUsername("bytecode");
		dataSource.setPassword("root1234");
		
		return dataSource;
		
	}
	
}
