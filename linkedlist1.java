// addlast
// search
// deleteFromEnd
//reverselinkedlist
// insert
//deleteNodeOfSpecificPostion
//deleteNode(key)

public class linkedlist1 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {

            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public boolean search() {
        int el = 4;
        Node temp = head;
        while (temp != null) {
            if (temp.data == el) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteFromEnd() {
        int k = 2;
        Node f = head;
        Node s = head;
        for (int i = 0; i < k; i++) {
            f = f.next;
        }
        if (f == null) {
            head = head.next;
            return;
        }
        while (f.next != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
    }

    public void reveselinkedlist() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public void deleteNodeOfSpecificPostion() {

        int position = 4;
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        Node temp1 = head.next;
        for (int i = 0; i < position - 2; i++) {

            temp = temp.next;
            temp1 = temp1.next;
        }
        temp.next = temp1.next;
    }

    public void insert() {
        int el = 10;
        int pos = 1;
        Node newnNode = new Node(el);
        Node temp = head;
        if (head == null) {
            head = newnNode;
            return;
        }
        if (pos == 1) {

            newnNode.next = head;
            head = newnNode;
            return;
        }

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newnNode.next = temp.next;
        temp.next = newnNode;
    }

    public void deleteNode() {

        int key = 4;

        Node temp = head;
        Node temp1 = null;

        while(temp!=null && temp.data==key){

            head=head.next;
            return;
        }
        while (temp != null && temp.data != key) {
            temp1 = temp;
            temp = temp.next;
        }
        temp1.next = temp.next;
    }

    public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            list.addlast(arr[i]);
        }
        list.display();
        // System.out.println(list.search());

        // list.deleteFromEnd();
        // list.display();

        // list.reveselinkedlist();
        // list.display();

        // list.insert();
        // list.display();

        // list.deleteNodeOfSpecificPostion();
        // list.display();

        list.deleteNode();
        list.display();
    }
}
