package com.app.actuator;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;


@Endpoint(id = "appversion")
@Component
public class VersionEndpoint {
    record User(String name, Integer id) {}
    record Version(String version, List<User> users) {}

    private ObjectMapper om = new ObjectMapper();

    @ReadOperation
    public String hi() {
        try {
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(new Version("1.2.3", List.of(new User("HA", 1999))));
        } catch (Exception e) {
            return "error";
        }
    }
}
