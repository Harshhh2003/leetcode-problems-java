public class deletenthnode {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void nthnode(node head, int n) {
        node fast = head;
        node slow = head;

        for (int i = 1; i <= n; i++) {
            if (fast == null) {  
                return;
            }
            fast = fast.next;
        }

        if (fast == null) {  
            head = head.next;
            return; // we uess this condition  to delete the 1st / head node
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;  
    }

    public static void main(String[] args) {
        node a = new node(100);
        node b = new node(10);
        node c = new node(50);
        node d = new node(200);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);

        nthnode(a, 4);  // Delete the 4th node

        display(a);
    }
}
