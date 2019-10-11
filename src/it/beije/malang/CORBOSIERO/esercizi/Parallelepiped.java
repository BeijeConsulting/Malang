package it.beije.malang.CORBOSIERO.esercizi;

public class Parallelepiped {

    public static final int DEFAULT_VALUE = 1;

    private double base;
    private double height;
    private double depth;
    private double volume;

    public Parallelepiped(double base, double height, double depth) throws Exception{
        if(!Double.isNaN(base) && !Double.isNaN(height) && !Double.isNaN(depth)){
            if(base == 0 || height == 0 || depth == 0)
                throw new Exception();

            this.base = base;
            this.height = height;
            this.depth = depth;
            this.volume = volume();
        }
        else
            throw new Exception();
    }

    public Parallelepiped(double base, double height) throws Exception {
        this(base, height, DEFAULT_VALUE);
    }

    public Parallelepiped(double base) throws Exception {
        this(base, DEFAULT_VALUE, DEFAULT_VALUE);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    private double area(){
        return base * height;
    }

    private double volume(){
        return area() * depth;
    }

    public double getVolume(){
        return volume;
    }
    
    public static void main(String[] args) {
    	try {
    		Parallelepiped p = new Parallelepiped(10,1,10);
    		System.out.println(p.getVolume());
    	}
    	catch(Exception ex) {
    		System.err.println(ex.getStackTrace());
    	}
    }
}
