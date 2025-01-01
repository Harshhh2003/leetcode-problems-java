import java.util.*;
public class balancedbracket{
    public static boolean balanced(String st){
        Stack<Character> str = new Stack<>();
        int h = st.length();
        for(int i=0; i<h; i++){
            char ch = st.charAt(i);
            if(ch == '('|| ch == '{'|| ch == '[') {
                str.push(ch);

            } else{ // closing bracket se start ho rha
             if(str.size()==0)
             return false;
          if( str.peek()=='(' ||str.peek()=='{'|| str.peek()=='[' ){
            str.pop(); // if opening bracket is present then pop it from the stack 
          }
            }
           
        }
        if(str.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        // System.out.println(st);
        System.out.println(balanced(st));
}
}