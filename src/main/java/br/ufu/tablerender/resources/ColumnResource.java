package br.ufu.tablerender.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ufu.tablerender.models.ColumnMetadata;
import br.ufu.tablerender.services.ColumnService;

@Path("/column")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ColumnResource {

    @Inject
    ColumnService service;
    
    @GET
    public List<ColumnMetadata> getAllTables() {
        return service.getAll();
    }

    @POST
    public ColumnMetadata createTable(ColumnMetadata ColumnMetadata) {
        service.createTable(ColumnMetadata);
        return ColumnMetadata;
    }
}