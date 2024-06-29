public class tohExample {

    // Recursive method to solve Tower of Hanoi
    static void toh(int n, char source, char auxiliary, char destination) {
        if (n == 1) { // Base case
            System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
            return;
        }
        // Move n-1 disks from source to auxiliary
        toh(n - 1, source, destination, auxiliary);
        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        // Move n-1 disks from auxiliary to destination
        toh(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // Example number of disks
        System.out.println("Solution for " + numberOfDisks + " disks:");
        toh(numberOfDisks, 'A', 'B', 'C'); // Rods A, B, and C
    }
}
