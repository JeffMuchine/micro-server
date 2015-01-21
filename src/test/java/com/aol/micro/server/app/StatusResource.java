package com.aol.micro.server.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.aol.micro.server.rest.RestResource;

@Component
@Path("/status")
public class StatusResource implements RestResource {

	@GET
	@Produces("text/plain")
	@Path("/ping")
	public String ping() {
		return "ok";
	}

}