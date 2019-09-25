package it.beije.malang;

public class Parser {

    public static int parseInt(String s) {
        int res = 0;
        
        if(s.isEmpty())
        	throw new IllegalArgumentException("Wrong string format");

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c))
                res = (res * 10) + (c - 48);
            else
                throw new IllegalArgumentException();
        }

        return res;
    }

    public static double parseDouble(String n){
        double res = 0;
        if(!n.contains("."))
            return parseInt(n);
        else
        {
        	String[] s = n.split("\\.");
        	String s1 = s[0];
        	String s2 = s[1];
        	
            if(s.length > 2)
                throw new IllegalArgumentException("String contains multiple floating points");
           
            res += parseInt(s1);

            for(int i = 0; i < s2.length(); i++){
                char c = s2.charAt(i);
                if(Character.isDigit(c)) 
                    res += (c - 48) * Math.pow(10, -(i + 1));
                else
                    throw new IllegalArgumentException("String contains NaN values");
            }
        }

        return res;
    }

    public static void main(String... args){
       
    	System.out.println(parseDouble("111.399A"));
    }

}
