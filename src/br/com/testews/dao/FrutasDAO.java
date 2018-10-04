package br.com.testews.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.testews.model.Fruta;
import br.com.testews.model.ListFrutas;

public class FrutasDAO {
	
	private static Map<Integer, ListFrutas> banco = new HashMap<Integer, ListFrutas>();
	
	static {
		
		Fruta fruta1 = new Fruta(1, "Laranja", "Valencia", "Santo Antonio");
		Fruta fruta2 = new Fruta(2, "Laranja", "Pera", "Sao Joao");
		
		ListFrutas frutas = new ListFrutas()
								.add(fruta1)
								.add(fruta2);
		banco.put(1, frutas);
	}
	
	public ListFrutas busca(Integer id) {
		return banco.get(id);
	}	
}
