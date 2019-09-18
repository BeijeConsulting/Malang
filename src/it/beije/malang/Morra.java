package it.beije.malang;

import java.util.ArrayList;

public class Morra {
	private Morra_Cinese p1;
	private Morra_Cinese p2;
	
	public Morra(Morra_Cinese p1,Morra_Cinese p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	public void setP1(Morra_Cinese p1) {
		this.p1 = p1;
	}
	
	public void setP2(Morra_Cinese p2) {
		this.p2 = p2;
	}
	
	public Morra_Cinese getP1() {
		return p1;
	}
	
	public Morra_Cinese getP2() {
		return p2;
	}
	
	
	public String getResult() {
		if (p1==p2)
		{
			return "parità";
		}
		ArrayList<Morra_Cinese> list=new ArrayList<>();
		list.add(Morra_Cinese.CARTA);
		list.add(Morra_Cinese.SASSO);
		list.add(Morra_Cinese.FORBICE);
		if (list.indexOf(p1)==(list.indexOf(p2)-1))
		{
			return "p1 wins";
		}
		if (list.indexOf(p2)==(list.indexOf(p1)-1))
		{
			return "p2 wins";
		}
		if (list.indexOf(p1)-list.indexOf(p2)>1 || list.indexOf(p1)-list.indexOf(p2)<-1)
		{
			if (list.indexOf(p1)==list.size()-1)
				return "p1 wins";
			else
				return "p2 wins";
		}
		return "";
	}
}
