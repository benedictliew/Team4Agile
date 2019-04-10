import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
	
	public ArrayList<ListItem> bubbleSortByDueDate(ArrayList<ListItem> al) 
	{ 
		Collections.sort(al, new Comparator<ListItem>() {
			public int compare(ListItem o1, ListItem o2) {
				return o1.getDueDate().compareTo(o2.getDueDate());
			}
		});
		
		return al;
	}
	
	public ArrayList<ListItem> bubbleSortByDone(ArrayList<ListItem> al) 
	{ 
		Collections.sort(al, new Comparator<ListItem>() {
			public int compare(ListItem o1, ListItem o2) {
				return Boolean.compare(o1.isDone(),o2.isDone());
			}
		});
		
		return al;
	}
}
