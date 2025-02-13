package entities;

import java.util.ArrayList;
import java.util.List;

public class disciplina {
	
	private String nome;
	List<professor> professor = new ArrayList<professor>();
	List<laboratorio>lab = new ArrayList<laboratorio>();
	
	public disciplina(String nome) {
		this.nome = nome;
	}
	
	
}
