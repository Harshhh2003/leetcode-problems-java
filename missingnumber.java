public class missingnumber{
    public static void main(String[] args) {
      int[] arr = {4, 5, 1, 6, 0, 2};

        int n = arr.length ;
        // range  1to n   n is 6 here
  int sum_ans =  (n*  (n+1))/2;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans  + arr[i];
    
        }
                int missing_num = sum_ans -ans;

System.out.println( " missing number in this given arrays is   "  +   missing_num);


    }
}