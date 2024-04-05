//package com.example.elasticDemo.config;
//
//import org.apache.http.auth.AuthScope;
//import org.apache.http.auth.UsernamePasswordCredentials;
//import org.apache.http.client.CredentialsProvider;
//import org.apache.http.impl.client.BasicCredentialsProvider;
//import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
//import org.apache.http.ssl.SSLContextBuilder;
//import org.apache.http.ssl.SSLContexts;
//import org.elasticsearch.client.RestClientBuilder;
//import org.springframework.context.annotation.Configuration;
//
//import javax.net.ssl.SSLContext;
//import java.io.File;
//
//@Configuration
//public class httpClientConfig implements RestClientBuilder.HttpClientConfigCallback {
//    @Override
//    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpAsyncClientBuilder) {
//        try {
//            final CredentialsProvider credentialsProvider=new BasicCredentialsProvider();
//            UsernamePasswordCredentials usernamePasswordCredentials=new UsernamePasswordCredentials("elastic","9Gxxz6RKlxv9njKYm6FD");
//            credentialsProvider.setCredentials(AuthScope.ANY,usernamePasswordCredentials);
//            httpAsyncClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
//
//            String trustStoreLocation="\\home\\shashank\\elasticsearch-8.12.2\\config\\certs\\truststore.p12";
////            String trustStoreLocation="//home//shashank//elasticsearch-8.12.2//config//certs//truststore.p12";
//
//            File trustStoreLocationfile = new File(trustStoreLocation);
//
//            SSLContextBuilder sslContextBuilder= SSLContexts.custom().loadTrustMaterial(trustStoreLocationfile,"password".toCharArray());
//            SSLContext sslContext=sslContextBuilder.build();
//            httpAsyncClientBuilder.setSSLContext(sslContext);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return httpAsyncClientBuilder;
//    }
//}
