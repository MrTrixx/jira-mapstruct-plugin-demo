package ru.jira.mapstruct.plugin.demo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/healthCheck")
public class HealthCheckResource {

    @GET
    public String healthCheck() {
        return "OK";
    }
}
