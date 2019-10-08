package it.beije.malang;


interface Climb {
int isTooHigh(int height, int limit);
}


public class Climber {
	

	 public static void main(String[] args) {
	 check((h, l) -> h  , 5);
	 }


 static void check(Climb climb, int height) {
	 
System.out.println(climb.isTooHigh(height, 10));

 
 }}