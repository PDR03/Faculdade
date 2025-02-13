package entities;

public class laboratorio {
	
	private String area;
	private String bloco;
	private String sala;
	
	public laboratorio(String area, String bloco, String sala) {
		super();
		this.area = area;
		this.bloco = bloco;
		this.sala = sala;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}
	
	
	
}
