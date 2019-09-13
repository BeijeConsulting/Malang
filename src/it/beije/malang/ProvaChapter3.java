package it.beije.malang;
import java.util.*;// date quello vecchio e qui dentro.
import java.time.*;


public class ProvaChapter3 {

public static void performAnimalEnrichment(LocalDate start, LocalDate end,
		Period period) { // uses the generic period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
		System.out.println("give new toy: " + upTo);
		upTo = upTo.plus(period); // adds the period
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(numbers.get(1));
		System.out.println(numbers);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length); 
		String[] stringArray = list.toArray(new String[0]);
		for(int i =0; i<stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		LocalTime time3 = LocalTime.of(6, 15, 30, 200000000);
		System.out.println(time3);
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2016, 2,29);
		System.out.println(date1);
		System.out.println(date2);
		LocalDateTime dateTime1 = LocalDateTime.of(0, Month.JANUARY, 20, 6,6);
		dateTime1 = dateTime1.minusYears(1800);
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time3);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		Date jan = new Date(2019,3,5);
		System.out.println("jan=" + jan);
		LocalDate d =LocalDate.now();
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1).ofDays(7); // create a period: se lo concateno il periodo mi tiene conto di una settimana dovrei scrivere period.of(1,0,7) e fa un periodo di un anno e una settimana.
		performAnimalEnrichment(start, end, period);
		System.out.println("animal enrichment done");
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
	}

}
