package br.ufu.tablerender.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ufu.tablerender.models.TableMetadata;
import br.ufu.tablerender.services.TableService;

@Path("/table")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TableResource {

    @Inject
    TableService service;
    
    @GET
    public List<TableMetadata> getAllTables() {
        return service.getAll();
    }

    @POST
    public TableMetadata createTable(TableMetadata tableMetadata) {
        service.createTable(tableMetadata);
        return tableMetadata;
    }

}