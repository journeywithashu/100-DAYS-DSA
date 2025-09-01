public class SumSubArray {
  public static void printSubarray(int arr[]){
    int n = arr.length;
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];

    prefix[0] = arr[0];
    //calculate prefix array
    for(int i= 1;i<prefix.length;i++){
     prefix[i] = prefix[i -1] + arr[i];
       
    }

    for(int i = 0; i<n;i++){//Start
      for(int j= i ; j<n;j++){//end
          currentSum = i == 0 ?prefix[j]: prefix[j] - prefix[i-1];
    
         System.out.println(currentSum);
        if(maxSum < currentSum){
          maxSum = currentSum;
        }
      }
      
    }
    System.out.println("max sum ="+maxSum);
  }
  public static void kadanes(int arr[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i = 0; i<arr.length;i++){
     cs = cs + arr[i];
     if(cs<0){
          cs = 0;
     }
     ms = Math.max(cs, ms);
    }
    System.out.println("our max subarray sum is: "+ms);
  }
    public static void main(String[] args) {
      int [] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
      kadanes(nums);
      
      
  }
}

