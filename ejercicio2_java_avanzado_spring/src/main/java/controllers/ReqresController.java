package controllers;


import com.openbootcamp.ejercicio2_java_avanzado_spring.models.Reqres;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;
import services.ReqresService;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class ReqresController {
    private ReqresService ReqresService;

    public ReqresController(ReqresService ReqresService)
    {
        this.ReqresService = ReqresService;
        ReqresService.add(new Reqres("Aritz",30));
        ReqresService.add(new Reqres("Jua",23));
        ReqresService.add(new Reqres("Luisa",29));
    }

    @GET
    @Path("/api/users?page=2")
    @Produces("application/json")
    public List<Reqres> listAll()
    {
        return ReqresService.getAll();
    }

    @GET
    @Path("/api/users/{id}")
    @Produces("application/json")
    public Reqres listOne(@PathParam("id") int id)
    {
        return ReqresService.get(id);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response newReqres(Reqres reqres)
    {
            ReqresService.add(reqres);

            return Response.created(URI.create("/bootcampers/" + reqres.getName())).build();
    }
}
