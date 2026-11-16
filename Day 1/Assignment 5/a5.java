import java.util.*;

class Main {
    public static void main(String[] args) {

        String seats[] = new String[3];
        Queue<String> q = new LinkedList<String>();
        seats[0] = "Asha";
        seats[1] = "Ravi";
        seats[2] = "Meena";
        q.add("Kiran");
        q.add("Pooja");

        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + q);

        for (int i = 0; i < 3; i++) {
            if (seats[i].equals("Ravi")) {

                if (!q.isEmpty()) {
                    seats[i] = q.remove();
                } else {
                    seats[i] = null;
                }
                break;
            }
        }

        System.out.println("After dropout:");
        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + q);
    }
}