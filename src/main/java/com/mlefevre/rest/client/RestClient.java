package com.mlefevre.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

public class RestClient {

    private RestTemplate client;


    public RestClient() {
        this.client = new RestTemplate();
    }

    public <T,E> T post(URI uri, E data, Class<T> returnType) throws RestClientException {
        ResponseEntity<T> result = this.client.postForEntity(uri, data, returnType);
        return result.getBody();
    }

    public <T> T get(URI uri, Map<String, ?> data, Class<T> returnType) throws RestClientException {
        ResponseEntity<T> result = this.client.getForEntity(uri.toString(), returnType, data);
        return result.getBody();
    }

    public void delete(URI uri, Map<String, ?> data) throws RestClientException {
        this.client.delete(uri.toString(), data);
    }

}