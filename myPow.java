public class myPow{
    public double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n; 
        }

      
        double half = myPow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half; 
        } else {
            return half * half * x; 
        }
    }

    public static void main(String[] args) {
        myPow solution = new myPow();
        double result = solution.myPow(2.0, 10); 
        System.out.println(result); 
    }
}