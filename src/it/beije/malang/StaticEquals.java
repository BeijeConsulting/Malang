package it.beije.malang;
import java.util.ArrayList;

public class StaticEquals {

public static boolean staticEquals(ArrayList<String> list1,ArrayList<String> list2) {
	if(list1.size()!=list2.size()) 
	{
		return false;
	}
	else {
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)!=list2.get(i))
			{
				return false;
			}
			
		}
		return true;
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringBodyBuilder sb= new StringBodyBuilder("frenklynRonaldinho");
			System.out.println(sb.toBBString());
			System.out.println(Character.toUpperCase(sb.toString().charAt(0)));
			System.out.println(StringBodyBuilder.mrOmlympiaChampionsToString());
			System.out.println(StringBodyBuilder.credits());
			System.out.println(StringBodyBuilder.credits());
	}

}
