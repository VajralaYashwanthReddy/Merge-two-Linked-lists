class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to merge two linked lists
    public LinkedList merge(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null) {
            mergedList.insert(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.insert(current2.data);
            current2 = current2.next;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Inserting elements in the first linked list
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        // Inserting elements in the second linked list
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        System.out.println("List 1:");
        list1.display();

        System.out.println("List 2:");
        list2.display();

        // Merging the two linked lists
        LinkedList mergedList = new LinkedList();
        mergedList = mergedList.merge(list1, list2);

        System.out.println("Merged List:");
        mergedList.display();
    }
}
