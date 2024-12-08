public class IntersectionTwoLinkedLists {


    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

  
    void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public node getIntersectionNode(node headA, node headB) {
        node tempA = headA;
        node tempB = headB;

        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

   
        tempA = headA;
        tempB = headB;


        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next;
            }
        } else if (lengthB > lengthA) {
            int steps = lengthB - lengthA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA; 
    }

    public static void main(String[] args) {
        IntersectionTwoLinkedLists list = new IntersectionTwoLinkedLists();

        node a1 = new node(4);
        node a2 = new node(1);
        node c1 = new node(8);
        node c2 = new node(4);
        node c3 = new node(5);

     
        node b1 = new node(5);
        node b2 = new node(0);
        node b3 = new node(1);

    
        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;

      
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

    
        node intersection = list.getIntersectionNode(a1, b1);


        if (intersection != null) {
            System.out.println("Intersection at node with value " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}
