import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Team4ToDoList {
	ArrayList<ListItem> al = new ArrayList<ListItem>();
	private int iD;
	
	public static void main(String[] args){
		boolean exit = false;
		do {
			showMenu();
			int input = readInput();
			if (input==9) exit=true;
		} while (!exit);
	}
	
	public static void showMenu(){
		System.out.println("Welcome to To Do List Application");
		showCurrentList();
		System.out.println("Menu: ");
		System.out.println("1. List all to do list");
		System.out.println("2. Add new item");
		System.out.println("3. Delete an item");
		System.out.println("4. Mark an item as complete");
		System.out.println("9. Quit");
		System.out.print("Enter your choice: ");
	}
	
	public static int readInput(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	
		
		switch(input){
		case 1:
			System.out.println("1");
			break;
			
		case 2:
			System.out.println("2");
			break;
			
		case 3:
			System.out.println("3");
			break;
			
		case 9:

			break;
		default:
			System.out.println("Invalid choice");
		}
		
		
		return input;
	}
	
	public static void showCurrentList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Fix bug no 1");
		list.add("Fix bug no 2");
		list.add("Fix bug no 3");
		
		for (String s : list){
			System.out.println(s);
		}
		
	}
	
	public boolean AddToDoListItem(String name, Date dueDate){
		try{
			ListItem li = new ListItem();
			li.setName(name);
			li.setID(iD);
			li.setDueDate(dueDate);
			li.setDone(false);
			al.add(li);
			iD++;
		
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	
	public boolean RemoveToDoListItemByName(String name){
		boolean result = false;
		
		for(int i=0;i<al.size();i++){
			if(al.get(i).getName().equals(name)){
				al.remove(i);
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public boolean RemoveToDoListItemByID(int id){
		boolean result = false;
		
		for(int i=0;i<al.size();i++){
			if(al.get(i).getID() == id){
				al.remove(i);
				result = true;
				break;
			}
		}
		
		return result;
	}

	public boolean ModifyToDoListItemName(int id, String newName) {
		boolean result = false;
		for(int i=0;i<al.size();i++){
			if(al.get(i).getID() == id){
				al.get(i).setName(newName);;
				result = true;
				break;
			}
		}
		
		return result;
	}

	public boolean ModifyToDoListItemDueDate(int id, Date newDate) {
		boolean result = false;
		for(int i=0;i<al.size();i++){
			if(al.get(i).getID() == id){
				al.get(i).setDueDate(newDate);;
				result = true;
				break;
			}
		}
		
		return result;
	}

	public boolean ModifyToDoListItemDone(int id, boolean newDone) {
		boolean result = false;
		for(int i=0;i<al.size();i++){
			if(al.get(i).getID() == id){
				al.get(i).setDone(newDone);;
				result = true;
				break;
			}
		}
		
		return result;
	}
}