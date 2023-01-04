package com.openbootcamp.ejercicio1_java_avanzado_spring.Controllers;

import com.openbootcamp.ejercicio1_java_avanzado_spring.Models.Bootcamper;
import com.openbootcamp.ejercicio1_java_avanzado_spring.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootCampersController {
    private BootcamperService bootcamperService;

    public BootCampersController(BootcamperService bootcamperService)
    {
        this.bootcamperService = bootcamperService;
        bootcamperService.add(new Bootcamper("Aritz",30));

        bootcamperService.add(new Bootcamper("Paco",23));
        bootcamperService.add(new Bootcamper("Sonia",29));
    }

    @GET
    public String hello()
    {
        return "Hello bootcampers";
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listAll()
    {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcamper listOne(@PathParam("name") String name)
    {
        return bootcamperService.get(name);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response newBootcamper(Bootcamper bootcamper)
    {
            bootcamperService.add(bootcamper);

            return Response.created(URI.create("/bootcampers/" + bootcamper.getName())).build();
    }
}
