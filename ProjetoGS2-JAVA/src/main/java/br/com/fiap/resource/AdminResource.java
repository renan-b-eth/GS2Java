package br.com.fiap.resource;


import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import br.com.fiap.beans.Admin;
import br.com.fiap.bo.AdminBO;


@Path("/admin")
public class AdminResource {
	
	private AdminBO adminBO = new AdminBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Admin> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<Admin>) adminBO.selecionarBo();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(Admin admin, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		adminBO.inserirBo(admin);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(admin.getId()));
		return Response.created(builder.build()).build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(Admin admin, @PathParam("id") int id) throws ClassNotFoundException, SQLException {
				
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		adminBO.deletarBo(id);
		return Response.ok().build();
	}


}
