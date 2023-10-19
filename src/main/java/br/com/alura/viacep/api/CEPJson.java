package br.com.alura.viacep.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CEPJson {
    public void gerarJSON(String url) throws IOException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter escrita = new FileWriter("cep.json");
        escrita.write(gson.toJson(url));
        escrita.close();
    }
}
