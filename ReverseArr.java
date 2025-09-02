public class ReverseArr {

public static void reverseArray(int arr[]){
    int n = arr.length;

    //temporary array to store element
    //reversed order
    int [] temp = new int[n];

    //copy element from original array
    //to temp in reverse order
    for(int i = 0; i<n; i++){
        temp[i] = arr[n-i-1];
    }
    //copy element array back to original array
    for(int i = 0; i<n; i++){
        arr[i] = temp[i];
    }
}

    public static void main(String[] args) {
       int [] arr = {1, 4, 3, 2, 6, 5};
       reverseArray(arr);
       for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }

    }
}
  
