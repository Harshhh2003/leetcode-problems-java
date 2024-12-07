public class nthnode {

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static node nthnode(node head, int n) {
        int size = 0;
        node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int m = size - n + 1;

        

        temp = head;

        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
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

        node q = nthnode(a, 2);
        if (q != null) {
            System.out.println("2nd node from the end is: " + q.data);
        } else {
            System.out.println("Invalid position");
        }
    }
}
