package br.com.testews.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.testews.dao.FrutasDAO;
import br.com.testews.model.ListFrutas;

@Path("fruta")
public class FrutaResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("dados")
	public String busca() {
		
		ListFrutas frutas = new FrutasDAO().busca(1);
		
		return frutas.toJson();
	}
}
