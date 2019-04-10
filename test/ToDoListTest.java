package test;

import junit.framework.TestCase;
import org.junit.Test;

public class ToDoListTest extends TestCase {

	@Test
	public void testAddItem() {
		
		Team4ToDoList todolist = new Team4ToDoList();
		todolist.AddToDoListItem("aaa", new Date(2019, 10, 1));
		ListItem retrieveitem = todolist.getListItem("aaa");
		assertNotNull(retrieveitem);
	}
	
}
