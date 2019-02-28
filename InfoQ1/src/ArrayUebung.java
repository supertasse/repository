import java.util.ArrayList;
import java.util.List;

public class ArrayUebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
aufgabe1();
	}
static List<String>wochentage = new ArrayList<String>();

public static void aufgabe1()
{	
	wochentage.add("Montag");
	wochentage.add("Dienstag");
	wochentage.add("Mittwoch");
	wochentage.add("Donnerstag");
	wochentage.add("Freitag");
	wochentage.add("Samstag");
	wochentage.add("Sonntag");

	wochentage.set(4,"Nochnichtfreitag");
	
 System.out.println(wochentage);

	}
}

