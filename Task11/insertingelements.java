import java.util.*;
public class insertingelements {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        System.out.println("Current Linked List: " + linkedList);
        System.out.print("Enter the position to insert: ");
        int position = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the element to insert: ");
        String elementToInsert = scanner.nextLine();
        if (position >= 0 && position <= linkedList.size()) {
            linkedList.add(position, elementToInsert);
            System.out.println("Updated Linked List: " + linkedList);
        } else {
            System.out.println("Invalid position. Position should be between 0 and " + linkedList.size());
        }

        scanner.close();
    }
}