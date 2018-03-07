package com.example.demo.repository;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.example.demo.entity.Enseignant;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class EnseignantConfigJson implements RepositoryRestConfigurer {

	@Override
	public void configureConversionService(ConfigurableConversionService arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureExceptionHandlerExceptionResolver(ExceptionHandlerExceptionResolver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureHttpMessageConverters(List<HttpMessageConverter<?>> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureJacksonObjectMapper(ObjectMapper arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration arg0) {
		arg0.exposeIdsFor(Enseignant.class);		
	}

	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
