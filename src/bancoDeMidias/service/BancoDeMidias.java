package bancoDeMidias.service;
import java.util.ArrayList;
import java.util.List;

import bancoDeMidias.model.entities.Midia;
import bancoDeMidias.model.exceptions.MidiaNaoEncontradaException;
public class BancoDeMidias {

	List <Midia> catalog = new ArrayList<>();
	
	public void add(Midia midia) {
		catalog.add(midia);
	}
	
	public void remove(Midia midia) {
		catalog.remove(midia);
	}
	
	
	public void listAll() {
		if(catalog.isEmpty()) {
			throw new MidiaNaoEncontradaException("Catalog is empty");
		}
		for(Midia x: catalog) {
			System.out.println(x);
		}		
	}
	
	public void searchByTitle(String search) {
		boolean encontrado = false;
		for(Midia x: catalog) {
			if(x.getTitle().toLowerCase().contains(search.toLowerCase())) {
				encontrado = true;
				System.out.println(x);
			}
		}
		if(!encontrado) {
			throw new MidiaNaoEncontradaException("Media not found " + search);
		}
	}
	
	public void markAsRead(String search) {
		boolean encontrado = false;
		for(Midia x: catalog) {
			if(x.getTitle().toLowerCase().contains(search.toLowerCase())) {
				x.markAsRead();
				encontrado = true;
				System.out.println(x);
			}
		}
		if(!encontrado) {
			throw new MidiaNaoEncontradaException("Media not found " + search);
		}
	}
	
	public void markAsUnread(String search) {
		boolean encontrado = false;
		for(Midia x: catalog) {
			if(x.getTitle().toLowerCase().contains(search.toLowerCase())) {
				x.markAsUnread();
				encontrado = true;
				System.out.println(x);
			}
		}
		if(encontrado == false) {
			throw new MidiaNaoEncontradaException("Media not found " + search);
		}
	}
}
