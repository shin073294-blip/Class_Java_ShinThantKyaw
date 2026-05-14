package batch11.homeworks.Day07.Queue;

public class Main {
    public static void main(String[] args) {

        Queue waitingRoom = new Queue();

        for (int i = 1; i <= 5; i++) {
            waitingRoom.join("Person " + i);
        }

        waitingRoom.display();

        waitingRoom.serve();

        waitingRoom.join("Newcomer Kyaw Kyaw");
        System.out.println("Someone new joined the back of the line!");

        waitingRoom.display();

        System.out.println("\nTotal people waiting: " + waitingRoom.count());
    }
}
