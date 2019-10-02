package it.beije.malang.natura;
	public class Gecko extends Rettili {

		
		public void setEta(int eta) {
			super.setEta(eta + 1);
		}

		@Override
		public void mangiare() {
			
			// TODO Auto-generated method stub
			System.out.println("il gecko mangia gli insetti ");
		}

		@Override
		public void respirare() {
			// TODO Auto-generated method stub
			System.out.println("Tutti i retttili respirano dal naso");
		}
	}

