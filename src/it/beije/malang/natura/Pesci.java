package it.beije.malang.natura;

public abstract class Pesci extends Animale {
	
	private String colore;
	
	public void setcolore(String colore) {
		this.colore = colore;
	}
	
	public String getcolore() {
		return colore;
	}
	
	
	
	private int NumUova;
	
	public void setNumUova(int NumUova) {
		this.NumUova = NumUova;
	}
	
	
	public int getNumUova() {
		return NumUova;
	}
	
	
	
	
	private String TipoAcqua;
	
	public void setTipoAcqua(String TipoAcqua) {
		this.TipoAcqua = TipoAcqua;
	}
	
	
	public String getTipoAcqua() {
		return TipoAcqua;
	}
	
	
	

}
