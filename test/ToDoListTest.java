import static org.junit.Assert.*;
import org.junit.Test;
import Team4ToDoList;

public class ToDoListTest {

	@Test
	public void testAddItem() {
		
		Team4ToDoList todolist = new Team4ToDoList();
		todolist.AddToDoListItem("aaa", new Date(2019, 10, 1));
		ListItem retrieveitem = todolist.getListItem("aaa");
		assertNotNull(retrieveitem);
	}
	
}
