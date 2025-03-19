
import java.util.ArrayDeque;
import java.util.Scanner;

public class OrderLogs {
private ArrayDeque<String> orderLogs;}

 public OrderLogs() {
 orderLogs = new ArrayDeque<>();
 }

 public void addOrderLog(String log) {
 orderLogs.push(log);
}

private void mostRecentLogEntry() {
 System.out.println("Most recent log: " + orderLogs.peek());
 }

 private String getOrderLog() {
 return orderLogs.pop();
 }

 private void removeAllLogEntries() {
 orderLogs.clear();
 }

 private boolean orderLogsEmpty() {
 return orderLogs.isEmpty();
 }

 public void handleLogs() {
 Scanner scanner = new Scanner(System.in);
 String choice;}

 do {
 System.out.println("\nChoose what you want to do with order logs:");
 System.out.println("1. Display all the logs");
 System.out.println("2. Display the most recent logs");
 System.out.println("3. Remove a log entry");
 System.out.println("4. Remove all log entries");
 System.out.println("5. Check if the log is completely empty");
 System.out.println("6. Exit log management");
 System.out.println("Enter your choice (1-6):");
 choice = scanner.nextLine();}

 switch(choice) {
 case "1":
 System.out.println("All logs: " + orderLogs);}
 break;
case "2":
 if(!orderLogsEmpty()) mostRecentLogEntry();
 else System.out.println("No logs available");
 break;
 case "3":
if(!orderLogsEmpty()) System.out.println("Removed: " + getOrderLog());
 else System.out.println("No logs to remove");
 break;
 case "4":
 removeAllLogEntries();
 System.out.println("All logs removed");
 break;
 case "5":

