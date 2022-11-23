package com.app.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id = "appversion")
@Component
public class VersionEndpoint {
    @ReadOperation
    public String hi() {
        return "1.2.3";
    }
}
