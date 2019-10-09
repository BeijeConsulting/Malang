package it.beije.malang.natura;

public abstract class Carnivori extends Animale{
	

	//estensione classe astratta animale
		
		private String lunghCanini;
		
		public String getLunghCanini() {
			return lunghCanini;
		}
		
		public void setlunghCanini(String lunghCanini) {
			this.lunghCanini = lunghCanini;
		}
		
		public abstract void tipoAttacco();
	}


