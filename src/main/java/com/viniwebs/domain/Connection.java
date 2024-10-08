package com.viniwebs.domain;

import com.google.gson.Gson;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {

    public static Conversion getConnection(String search) {
        Dotenv dotenv = Dotenv.load();
        String api_key = dotenv.get("API_KEY");
        String url = "https://v6.exchangerate-api.com/v6/"+ api_key +"/pair/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url + search)).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Conversion.class);
    }
}
