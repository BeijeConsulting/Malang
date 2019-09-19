package it.beije.malang.es1;

public class OperationUtility {

    public static double sum(double... operands) throws NumberFormatException{
        if(operands.length == 1 && !Double.isNaN(operands[0]))
            return operands[0];

        double res = 0;
        for(double op : operands){
            if(Double.isNaN(op))
                throw new NumberFormatException();
            else
                res += op;
        }

        return res;
    }

    /*
    public static double sub(double... operands){

    }

    public static long sub(long... operands){

    }

    public static double mul(double... operands){

    }

    public static long mul(long... operands){

    }

    public static double div(double... operands){

    }

    public static long div(long... operands){

    }
    */

    public static void main(String[] args){
        System.out.println(sum(-10, 10));
    }

}
