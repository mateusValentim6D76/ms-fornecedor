package br.com.mv.fornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"br.com.mv.fornecedor.model"})
public class MsFornecedorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFornecedorApplication.class, args);
	}

}
