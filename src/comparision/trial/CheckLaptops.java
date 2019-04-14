package comparision.trial;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CheckLaptops {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",12,800));
		laps.add(new Laptop("Mac",8,600));
		laps.add(new Laptop("Acer",16,1300));
		
		
		
		Collections.sort(laps,(lap1,lap2)->
			{if(lap1.getRam() > lap2.getRam())
				return 1;
			else
				return -1;
			});
		System.out.println(laps);
		
	
	}

}
