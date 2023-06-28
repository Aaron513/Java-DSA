public class arrays {

    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void demoArray() {
        int[] myArray = new int[5];
        // printArray(myArray);
        myArray[0]=5;
        myArray[1]=3;
        myArray[2]=1;
        myArray[3]=6;
        myArray[4]=13;
        myArray[2]=7;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j]%2 != 0){
                result[idx] = arr[j];
                idx++;
            }
        }
        return result;
    }

    public static void reverseArr(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;        
    }
    
    public static void moveZeros(int[] arr, int n) {
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

            if(arr[j]!=0){
                j++;
            }
        }   
    }
    
    public static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n+1)) / 2;
        for (int i : arr) {
            sum -= i;
        }  
        return sum;      
    }

    public static void main(String[] args) {
        demoArray();
        
        printArray(new int[] {5, 1, 2, 6, 23, 11}); 
        
        int[] arr = {3, 2, 4, 7, 10, 6, 5}; 
        printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);

        int[] numbers = {2, 11, 5, 10, 7, 8};
        printArray(numbers);
        reverseArr(numbers, 0, numbers.length-1);
        printArray(numbers);

        int[] arr1 = {5, 9, 3, 0, 1, 2};
        printArray(arr1);
        int min = findMin(arr1);
        System.out.println(min);

        int[] arr2 = {4, 9, 3, 6, 9, 2};
        printArray(arr2);
        int secondmax = findSecondMax(arr2);
        System.out.println(secondmax);

        int[] arr3 = {8,1,0,2,1,0,3};
        printArray(arr3);
        moveZeros(arr3, arr3.length);
        printArray(arr3);

        int[] arr4 = {5,1,2,9,10};
        printArray(arr4);
        int[] resizeArr = resize(arr4, 10);
        printArray(resizeArr);

        int[] arr5 = {2,4,1,8,6,3,7};
        int missingNo = missingNum(arr5);
        System.out.println(missingNo);

    }
}