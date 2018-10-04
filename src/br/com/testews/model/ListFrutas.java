package br.com.testews.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ListFrutas {
	
	private List<Fruta> frutas = new ArrayList<>();
	
	public ListFrutas add(Fruta fruta) {
		frutas.add(fruta);
		return this;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}
}