public class deletemiddleelement {
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
            this.next = null;
        }
    }

    public static node deletemiddle(node head) {
        if (head == null || head.next == null) return null;

        node slow = head;
        node fast = head;
        node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }

    public static void main(String[] args) {
        deletemiddleelement list = new deletemiddleelement();
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(5);

        list.display(head);
        head = deletemiddle(head);
        list.display(head);
    }
}
