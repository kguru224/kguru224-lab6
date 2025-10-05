import java.util.Random;

public class ThingList {
    private Node head;

    private class Node {
        Thing data;
        Node next;
        Node(Thing t) { data = t; next = null; }
    }

    public void addThing(Thing t) {
        Node newNode = new Node(t);
        if (head == null) head = newNode;
        else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    public void addAll(java.util.List<Thing> things) {
        for (Thing t : things) addThing(t);
    }

    public void moveAll(Random rand) {
        Node current = head;
        while (current != null) {
            current.data.move(rand);
            current = current.next;
        }
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
