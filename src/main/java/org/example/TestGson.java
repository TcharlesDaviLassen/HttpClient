package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;
// import java.nio.file.Path;


public class TestGson {

    public static final String URL_POST = "https://brasilapi.com.br/api/feriados/v1/2023";
    //    public static final String URL_POST = "http://177.44.248.60:3000";
    // public static final String FILE_JSON =
    // "/home/jm/IdeaProjects/HttpExample/pedido.json";

    public static void main(String[] args) throws IOException, InterruptedException {
        
        // cliente HTTP
        // HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = (HttpRequest) HttpRequest.newBuilder();


        //// Exemplo Síncrono
                HttpClient client = HttpClient.newBuilder()
                        // .version(Version.HTTP_1_1)
                        // .followRedirects(Redirect.NORMAL)
                        // .connectTimeout(Duration.ofSeconds(20))
                        // .proxy(ProxySelector.of(new InetSocketAddress("proxy.example.com", 80)))
                        // .authenticator(Authenticator.getDefault())
                        .build();
                HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                        .GET()
                        .uri(URI.create(URL_POST))
                        .header("Accept", "application/json")
                        .header("Content-Type", "application/json")
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.statusCode());
//                System.out.println(response.body());

        String data = response.body();
        // Cria uma instância Gson
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        // Serialize o objeto – Converta o objeto  em uma string JSON
        String jsonToString = gson.toJson(data);
        //        System.out.println("Converting object to JSON string:\n" + jsonToString);

        // Desserialize o objeto – Converta a string JSON de volta para o objeto
        String p = gson.fromJson(jsonToString, String.class);
        EntityDataObjectTranferenceDTO a = gson.fromJson(p, EntityDataObjectTranferenceDTO.class);
                System.out.println("Converting Person object to JSON string:\n" + p);

                System.out.println("Start point: " + p);
                p = p.substring(1, p.length() - 1);
                System.out.println("Get without \": " + p);
                p = p.replaceAll("\\\\\"", "\"");

                System.out.println("Person:\n" + p);



//        for (EntityDataObjectTranferenceDTO item : p.getItens()) {
//            System.out.println("----------------------------------------------------------");
//            System.out.println("   Ped. nº: " + item.getDate());
//            System.out.println("   Item: " + item.getName());
//            System.out.println("   Qtd: " + item.getType());
//        }





            //        String data = response.body();
        //        // Vindo como OBJETO
        //        System.out.println("data: " + data);
        //       ////read json file data to String
        //        //        byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));
        //        ////create ObjectMapper instance
        //        ObjectMapper objectMapper = new ObjectMapper();
        //        ////convert json string to object
        //        //        String emp = objectMapper.readValue(data, String.class);
        //        ////convert Object to json string
        //        // Employee emp1 = createEmployee();
        //        ////configure Object mapper for pretty print
        //        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        //        ////writing to console, can write to any output stream such as file
        //        StringWriter stringApi = new StringWriter();
        //        objectMapper.writeValue(stringApi, data);
        //        System.out.println("Employee JSON is\n" + stringApi);



        //// Exemplo assíncrono
        //        HttpRequest requestAsync = HttpRequest.newBuilder()
        //                .uri(URI.create(URL_POST))
        //                // .timeout(Duration.ofMinutes(2))
        //                .header("Content-Type", "application/json")
        //                .header("Accept", "application/json")
        //                // .POST(BodyPublishers.ofFile(Paths.get("file.json")))
        //                .build();
        //        System.out.println("Http => " + requestAsync);
        //        client.sendAsync(requestAsync, HttpResponse.BodyHandlers.ofString())
        //                .thenApply(HttpResponse::body)
        //                .thenAccept(System.out::println)
        //                .join();

                    

        //// criar a requisição
        //        HttpRequest request = HttpRequest.newBuilder()
        //            // .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
        //            // .timeout(Duration.ofSeconds(10))
        //            .uri(URI.create(URL_POST))
        //            // .POST(URI.create(URL_POST))
        //            .build();
        //        System.out.println("Http => " + request);
        //        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        //            .thenApply(HttpResponse::body)
        //            .thenAccept(System.out::println)
        //            .join();
        //        System.out.println(request.bodyPublisher());


        //        HttpClient var1 = HttpClient.newHttpClient();
        //        HttpRequest var2 = HttpRequest.newBuilder()
        //                .uri(URI.create(URL_POST))
        //                .timeout(Duration.ofMinutes(2L))
        //                .header("Content-Type", "application/json")
        //                .build();
        //        System.out.println("Http => " + var2);
        //        CompletableFuture var10000 = var1.sendAsync(
        //                var2,
        //                HttpResponse
        //                        .BodyHandlers
        //                        .ofString())
        //                .thenApply(HttpResponse::body);
        //        PrintStream var10001 = System.out;
        //        Objects.requireNonNull(var10001);
        //        var10000.thenAccept(var10001::println).join();

    }
}