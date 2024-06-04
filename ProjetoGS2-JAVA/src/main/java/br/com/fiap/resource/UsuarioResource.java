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
import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.AdminBO;
import br.com.fiap.bo.UsuarioBO;


@Path("/usuario")
public class UsuarioResource {
	
	/*private AdminBO adminBO = new AdminBO();*/
	private UsuarioBO usuarioBO = new UsuarioBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Usuario> selecionarRs() throws ClassNotFoundException, SQLException{
		
		return (ArrayList<Usuario>) usuarioBO.selecionarBo();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(Usuario usuario, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		usuarioBO.inserirBo(usuario);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(usuario.getId()));
		return Response.created(builder.build()).build();
	}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(Usuario usuario, @PathParam("id") int id) throws ClassNotFoundException, SQLException {
				
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		usuarioBO.deletarBo(id);
		return Response.ok().build();
	}


}
