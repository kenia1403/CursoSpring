package com.bytecode.core;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bytecode.core.beans.PostComponent;
import com.bytecode.core.model.Conexion;
import com.bytecode.core.services.PostService;

@SpringBootApplication
public class CursoSpringApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public CursoSpringApplication() {
		
	}

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jdbcTemplate.execute("insert into permiso (Nombre) values ('Ejemplo')");
	}

}