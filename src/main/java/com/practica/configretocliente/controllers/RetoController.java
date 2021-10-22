package com.practica.configretocliente.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class RetoController {
	
	@Value("${recursos.recurso1}")
	private String recurso1;
	
	@Value("${recursos.recurso2}")
	private String recurso2;	
	
	@Value("${recursos.recurso3}")
	private String recurso3;	
	
	@Value("${valores.propiedad1}")
	private String propiedad1;
	
	@Value("${valores.propiedad2}")
	private String propiedad2;
	
	@GetMapping("/configreto")
	public String[] getConfig() {
		return new String[] 
				{this.recurso1,this.recurso2,this.recurso3,
						this.propiedad1,this.propiedad2};
	}
	
	

}
