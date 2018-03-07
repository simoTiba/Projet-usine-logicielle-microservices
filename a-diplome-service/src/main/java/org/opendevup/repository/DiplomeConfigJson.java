package org.opendevup.repository;

import java.util.List;

import org.opendevup.entity.Diplome;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class DiplomeConfigJson implements RepositoryRestConfigurer {

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
		arg0.exposeIdsFor(Diplome.class);		
	}

	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Bean
	public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
	
}


