
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class OrderQueue {
 private Queue<String> preparationQueue;}

 public OrderQueue() {
 preparationQueue = new ArrayDeque<>();
 }

public void addToQueue(String order) {
 preparationQueue.add(order);
}

 private void showNextOrder() {
 System.out.println("Next order to prepare: " + preparationQueue.peek());
 }

 private String prepareOrder() {
 return preparationQueue.poll();
 }

 private void clearQueue() {
 preparationQueue.clear();
 }

private boolean queueEmpty() {
 return preparationQueue.isEmpty();
 }

 public void manageQueue() {
Scanner scanner = new Scanner(System.in);
 String choice;}

 do {
 System.out.println("\nPizza Preparation Queue Management:");
 System.out.println("1. Show all orders in queue");
 System.out.println("2. Show next order to prepare");
 System.out.println("3. Complete and remove next order");
 System.out.println("4. Clear all orders");
 System.out.println("5. Check if queue is empty");
 System.out.println("6. Exit queue management");
 System.out.println("Enter your choice (1-6):");
 
 choice = scanner.nextLine();}

 switch(choice) {
 case "1":
 System.out.println("Orders in queue: " + preparationQueue);
 break;
 case "2":
 if(!queueEmpty()) showNextOrder();
 else System.out.println("No orders in queue");
break;
 case "3":
if(!queueEmpty()) System.out.println("Completed: " + prepareOrder());
 else System.out.println("No orders to complete");
 break;
case "4":
 clearQueue();
 System.out.println("Queue cleared");}

