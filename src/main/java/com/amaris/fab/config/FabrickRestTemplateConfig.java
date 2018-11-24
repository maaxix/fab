package com.amaris.fab.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.amaris.util.interceptor.HeaderRequestInterceptor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class FabrickRestTemplateConfig {
	@Value("${fabrick.AuthSchema}")
	private String AUTH_SCHEMA_VALUE;
    
    @Bean
    public RestTemplate restTemplate() {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(new HeaderRequestInterceptor("Content-Type", MediaType.APPLICATION_JSON_VALUE));
        interceptors.add(new HeaderRequestInterceptor("Accept", MediaType.APPLICATION_JSON_VALUE));
        
        interceptors.add(new HeaderRequestInterceptor("Auth-Schema", AUTH_SCHEMA_VALUE));
        
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return
            builder
                .additionalInterceptors(interceptors)
                .additionalMessageConverters(new MappingJackson2HttpMessageConverter(mapper))
                
                .build();
    }
}
