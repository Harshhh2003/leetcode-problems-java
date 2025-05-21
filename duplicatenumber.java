public class duplicatenumber{
        public static void main(String[] args) {
            int [] arr = {  5  ,6  , 3,  1,   9};
              Boolean found = false;
              int n = arr.length;
              for(int i =0; i<n; i++){
                for(int j =i+1 ; j<n; j++){
                    if(arr[i] == arr[j]){
             System.out.println("duplicate elemnt is present in the given array");
             found = true;break;

                    }
                }   if (found) {
        break; // outer loop se bhi nikal gaye
    }
              } if (!found) {
            System.out.println("No duplicate element found.");
        }

}

} 