package com.boot.microservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@Path("/add")
@WebService
@SOAPBinding(style = Style.RPC)
public interface AddResource {

	@GET
    @Path("/a/{a}/b/{b}")
	@WebMethod int addNumber(@QueryParam("a") int a, @QueryParam("b") int b);
}
