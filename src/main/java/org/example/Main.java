package org.example;

import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
// import java.nio.file.Path;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static final String URL_POST = "https://brasilapi.com.br/api/feriados/v1/2023";
//    public static final String URL_POST = "http://177.44.248.60:3000";
    // public static final String FILE_JSON =
    // "/home/jm/IdeaProjects/HttpExample/pedido.json";

    public static void main(String[] args) throws IOException, InterruptedException {
        // cliente HTTP
//         HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = (HttpRequest) HttpRequest.newBuilder();


        //// Exemplo Síncrono
//        HttpClient client = HttpClient.newBuilder()
//
//                // .version(Version.HTTP_1_1)
//                // .followRedirects(Redirect.NORMAL)
//                // .connectTimeout(Duration.ofSeconds(20))
//                // .proxy(ProxySelector.of(new InetSocketAddress("proxy.example.com", 80)))
//                // .authenticator(Authenticator.getDefault())
//                .build();
//        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create(URL_POST))
//                .header("Accept", "application/json")
//                .header("Content-Type", "application/json")
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.statusCode());
//        System.out.println(response.body());



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
        // HttpRequest request = HttpRequest.newBuilder()
        //// .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
        //// .timeout(Duration.ofSeconds(10))
        // .uri(URI.create(URL_POST))
        //// .POST(URI.create(URL_POST))
        // .build();
        // System.out.println("Http => " + request);
        //
        // client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        // .thenApply(HttpResponse::body)
        // .thenAccept(System.out::println)
        // .join();
        // System.out.println(request.bodyPublisher());


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