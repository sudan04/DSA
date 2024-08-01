// import java.util.PriorityQueue;

// public class priorityQueue {
//     public static void main(String[] args) {
//         // Create a PriorityQueue
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         // Insert elements with different priorities
//         pq.add(10);  // Priority 10
//         pq.add(20);  // Priority 20
//         pq.add(15);  // Priority 15
//         pq.add(5);   // Priority 5
//         pq.add(30);  // Priority 30

//         // Elements are dequeued based on their priority
//         while (!pq.isEmpty()) {
//             System.out.println(pq.poll());  // Prints elements in ascending order of priority
//         }
//     }
// }


import java.util.PriorityQueue;
import java.util.Comparator;

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (priority: " + priority + ")";
    }
}

class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        return Integer.compare(t1.priority, t2.priority);  // Min-heap: lower priority number means higher priority
    }
}

public class priorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue with custom comparator
        PriorityQueue<Task> pq = new PriorityQueue<>(new TaskComparator());

        // Insert tasks with different priorities
        pq.add(new Task("Task 1", 10));
        pq.add(new Task("Task 2", 5));
        pq.add(new Task("Task 3", 1));
        pq.add(new Task("Task 4", 7));
        pq.add(new Task("Task 5", 3));

        // Elements are dequeued based on their priority
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  // Prints tasks in order of their priority
        }
    }
}
