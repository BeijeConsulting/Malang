package it.beije.malang;

public class Parser {

    public static int parseInt(String s) {
        //val*10 + c-48
        int res = 0;

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
            if(n.indexOf('.') != n.lastIndexOf('.'))
                throw new IllegalArgumentException("String contains multiple floating points");

            String s1 = n.substring(0, n.indexOf('.'));
            String s2 = n.substring(n.indexOf('.'));
            res += parseInt(s1);

            for(int i = 1; i < s2.length(); i++){
                char c = s2.charAt(i);
                if(Character.isDigit(c))
                    res += (c - 48) * Math.pow(10, -i);
                else
                    throw new IllegalArgumentException("String contains NaN values");
            }
        }

        return res;
    }

    public static void main(String... args){
        System.out.println(parseDouble("150.055"));
        //System.out.println(parseDouble(".150.150"));
        //System.out.println(parseDouble("15A0.150"));
    }

}
