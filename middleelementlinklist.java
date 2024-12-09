public class middleelementlinklist {
    void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static node middleelement(node head) {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }

    public static void main(String[] args) {
        middleelementlinklist l1 = new middleelementlinklist();
        node a1 = new node(4);
        node a2 = new node(1);
        node c1 = new node(8);
        node c2 = new node(4);
        node c3 = new node(5);

      
        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;


        System.out.println("Linked List:");
        l1.display(a1);

        node middle = middleelement(a1);
        System.out.println("Middle element: " + middle.data);
    }
}
