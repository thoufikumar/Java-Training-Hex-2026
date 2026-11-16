import java.util.*;

class Main {
    public static void main(String[] args) {

        Stack<String> s = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {

            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter name:");
                    String name = sc.next();
                    s.push(name);
                    break;

                case 2:
                    if (s.empty()) {
                        System.out.println("Nothing to undo");
                    } else {
                        System.out.println("Undone:" + s.pop());
                    }
                    break;

                case 3:
                    if (s.empty()) {
                        System.out.println("Nothing to undo");
                    } else {
                        System.out.println("Last enrollment:" + s.peek());
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}