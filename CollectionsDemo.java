import java.util.*;


class Student implements Comparable<Student> {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public int compareTo(Student other) {

        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}


class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class CollectionsDemo {


    public static void arrayListExample() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add(1, "Orange");

        System.out.println("ArrayList: " + list);
        list.remove("Banana");
        System.out.println("After removal: " + list);
        System.out.println("Contains Mango? " + list.contains("Mango"));
    }


    public static void stackExample() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }


    public static void queueExample() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Jane");
        queue.offer("Tom");

        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }


    public static void priorityQueueExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("PriorityQueue (min-heap): " + pq);
        System.out.println("Head element: " + pq.peek());
        System.out.println("Removed: " + pq.poll());
        System.out.println("After poll: " + pq);
    }


    public static void dequeExample() {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Middle");
        deque.addLast("End");

        System.out.println("Deque: " + deque);
        deque.removeFirst();
        System.out.println("After removing first: " + deque);
    }


    public static void hashSetExample() {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");

        System.out.println("HashSet: " + set);
        set.remove("C++");
        System.out.println("After removal: " + set);
    }


    public static void treeSetExample() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        System.out.println("TreeSet (sorted): " + treeSet);
        System.out.println("First: " + ((TreeSet<Integer>) treeSet).first());
        System.out.println("Last: " + ((TreeSet<Integer>) treeSet).last());
    }


    public static void linkedHashSetExample() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");

        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
    }


    public static void hashMapExample() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Aman");
        map.put(2, "Babu");
        map.put(3, "Chauhan");

        System.out.println("HashMap: " + map);
        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);
        System.out.println("After removal: " + map);

        System.out.println("Iterating over map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }


    public static void comparableComparatorExample() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aman", 88));
        students.add(new Student("Rohit", 75));
        students.add(new Student("Suresh", 95));

        System.out.println("\nOriginal List: " + students);


        Collections.sort(students);
        System.out.println("Sorted by marks (Comparable): " + students);


        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by name (Comparator): " + students);
    }


    public static void main(String[] args) {


        System.out.println("=== ArrayList Example ===");
        arrayListExample();

        System.out.println("=== Stack Example ===");
        stackExample();

        System.out.println("=== Queue Example ===");
        queueExample();

        System.out.println("=== PriorityQueue Example ===");
        priorityQueueExample();

        System.out.println("=== Deque Example ===");
        dequeExample();

        System.out.println("=== HashSet Example ===");
        hashSetExample();

        System.out.println("=== TreeSet Example ===");
        treeSetExample();

        System.out.println("=== LinkedHashSet Example ===");
        linkedHashSetExample();

        System.out.println("=== HashMap Example ===");
        hashMapExample();

        System.out.println("=== Comparable and Comparator Example ===");
        comparableComparatorExample();
    }
}
