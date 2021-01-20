package com.softserveinc.ita.homeproject.api.tests;

import com.softserveinc.ita.homeproject.ApiClient;
import com.softserveinc.ita.homeproject.ServerConfiguration;

import java.util.HashMap;
import java.util.List;

public final class ApiClientUtil {

    public static ApiClient getClient() {
        String applicationExternalPort = System.getProperty("home.application.external.port");
        ApiClient client = new ApiClient();
        client.setUsername("admin@example.com");
        client.setPassword("password");
        client.setServers(List.of(new ServerConfiguration("http://localhost:"+applicationExternalPort+"/api/0",
                "No description provided", new HashMap())));
        return client;
    }
}
