public class palindromelinklist{
    void display(node head){
        node temp = head;
        while(temp !=null){
            System.out.println(temp.data+  "   ");
            temp= temp.next;

        } System.out.println();
    }
    public static class node{
        int data; node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node middle( node head){
        node fast = head;
        node slow = head;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;

        } return slow;
    }
    public static boolean palindrome(node head){
        if(head == null )
            return true;
         
        node mid = middle(head);
        node last = middle(mid.next);
        node current = head; 
        while(last != null){
            if(current.data != last.data)
                return false;
current = current.next;
last = last.next;
            
        } return true;

    }
    public static node reverse(node head) {
        if (head == null || head.next == null) {
            return head; 
        }

        node newnode = reverse(head.next); 
        head.next.next = head; 
        head.next = null; 

        return newnode;  
    }
    public static void main(String[] args) {
        palindromelinklist list = new palindromelinklist();
        node head = new node(2);
        head.next = new node(10);
        head.next.next = new node(30);
        head.next.next.next = new node(50);
        System.out.println("original linklist "   );
        list.display(head);
        if(palindrome(head)){
            System.out.println("given lionlist is plaindome");
        }
    else{
        System.out.println("not a palindrome: " );
    }

        
    }
}