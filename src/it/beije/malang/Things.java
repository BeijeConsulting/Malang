package it.beije.malang;
import java.util.ArrayList;

public class Things {

	private static boolean listEquals(ArrayList list, ArrayList list1)
	{
		if (list.size()!=list1.size())
			return false;
		for(int i=0;i<list.size();i++)
		{
			if (!list.get(i).equals(list1.get(i)))
				return false;
		}
		return true;
	}
	
	private static ArrayList<String> sortArray(ArrayList<String> list)
	{
		String temp;
		for (int r=0;r<list.size()-1;r++)
		{
			for (int c=r+1;c<list.size();c++)
			{
				if (list.get(r).compareTo(list.get(c))<0)
				{
					temp=list.get(r);
					list.set(r, list.get(c));
					list.set(c, temp);
				}
			}
		}
		return list;
	}
	
	private static int[][] revertArray(int [][] array)
	{
		int [][] temp=new int[array[0].length][array.length];
		for (int r=0;r<array.length;r++)
		{
			for (int c=0;c<array[r].length;c++)
			{
				temp[c][r]=array[r][c];
			}
		}
		return temp;
	}
	
	private static ArrayList<String> strArraytoList(String [] array){
		ArrayList<String> temp=new ArrayList<>();
		
		for (String value:array)
		{
			temp.add(value);
		}
		return temp;
	}
	
	private static ArrayList<ArrayList<String>> Array2DtoArrayList(String [][] array)
	{
		ArrayList<ArrayList<String>> list=new ArrayList<>();
		for (String[] value:array)
		{
			ArrayList <String> temp=new ArrayList<>();
			for (String str:value)
			{
				temp.add(str);
			}
			list.add(temp);
		}
		return list;
	}

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(6);
		list.add(59);
		list.add("543");
		
		ArrayList list1=new ArrayList();
		list1.add(6);
		list1.add("543");
		list1.add(59);
		
		System.out.println("list equals:"+listEquals(list,list1));
		
		ArrayList<String> liststr=new ArrayList<>();
		
		liststr.add("bella");
		liststr.add("eiciao");
		liststr.add("treeed");
		
		ArrayList<String> liststr1=new ArrayList<>();
		
		liststr.add("treeed");
		liststr.add("eiciao");
		liststr.add("bella");
		
		System.out.println(sortArray(liststr1));
		
		int [][] array= {{5,6},{7,8},{9,10}};
		
		System.out.println(revertArray(array));
		
		String [] strarray= {"bella","ei","ciao"};
		
		System.out.println(strArraytoList(strarray));
		
		String [][] array2d= {{"bella","ei","ciao"},{"oi","ai","ouch"},{"fdsdfd","fsddfs","ytres"}};
		
		System.out.println(Array2DtoArrayList(array2d));
		
		
	}
}
