//package com.example.elasticDemo.config;
//
//
//import co.elastic.clients.elasticsearch.ElasticsearchClient;
//import co.elastic.clients.json.jackson.JacksonJsonpMapper;
//import co.elastic.clients.transport.rest_client.RestClientTransport;
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ElasticConfig {
//
//
//    @Bean
//    public ElasticsearchClient elasticsearchClient(){
//        RestClientBuilder restClientBuilder = RestClient.builder(new HttpHost("localhost", 9200, "http"));
//
//        RestClientBuilder.HttpClientConfigCallback httpClientConfigCallback= new httpClientConfig();
//        restClientBuilder.setHttpClientConfigCallback(httpClientConfigCallback);
//
//        RestClient client= restClientBuilder.build();
//
//        RestClientTransport restClientTransport= new RestClientTransport(client,new JacksonJsonpMapper());
//
//        return new ElasticsearchClient(restClientTransport);
//
//    }
//}
