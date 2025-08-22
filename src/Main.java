
public class Main {
    public static void main(String[] args) {

//        linear and binary search
//        int nums[] = {4, 8, 0, 7, 0};
//        int targets = 4;
//        linearSearch(nums, targets);
//            binarySearch(nums,targets);
//
//
//    }
//
//    public static int linearSearch(int[] nums ,int target){
//        int steps = 0;
//        for (int i=0; i < nums.length; i++){
//            if (nums[i] == target)
//                System.out.println("Found at index linear " + i);
//            steps++;
//        }
//        System.out.println("linear search : " + steps);
//        return -1;
//    }
//    public static int binarySearch(int[] nums ,int target) {
//        int steps = 0;
//        int end = nums.length - 1;
//        int start = 0;
//
//        while (start <= end) {
//            steps++;
//            int mid = (start + end) / 2;
//
//            if (nums[mid] == target) {
//                System.out.println("Found at index binary " + mid);
//                System.out.println("binary search " + steps);
//                return mid;
//            } else if (nums[mid] < target) {
//                start = mid + 1; // parceque le mid n'a pas le target c'est pourca en vas ecrase avec 1
//            } else
//                end = mid - 1; // meme chose mais le contraire
//
//        }
//        return -1;
//    }
//  the end of lenear and binary search codes
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        bubble sort
//        int nums[] = {2,5,1,9,3,4,7,6,8};
//        int size = nums.length;
//
//        for(int n : nums)
//            System.out.print(n + " ");
//
//        for(int i=0;i<size;i++){
//            for(int j=0;j<size-1-i;j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println();
//        for(int n : nums)
//            System.out.print(n + " ");
//bubble sort finish
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//selection sort
//        int nums[] = {2,5,1,9,3,4,7,6,8};
//        int size = nums.length;
//        int temp = 0;
//        int minIndex=0;
//
//        System.out.println("before sorting");
//        for(int n : nums)
//            System.out.print(n +" ");
//
//        for(int i=0;i<size-1;i++){
//            minIndex = i;
//            for(int j=i+1;j<size;j++){
//                if(nums[j] < nums[minIndex]){
//                    minIndex = j;
//                }
//            }
//
//            temp = nums[minIndex];
//            nums[minIndex] = nums[i];
//            nums[i] = temp;
//            System.out.println();
//            for(int n:nums)
//                System.out.print(n + " ");
//        }
//
//        System.out.println();
//        System.out.println("after sorting");
//        for(int n : nums)
//            System.out.print(n +" ");
// ending selection sort
//+++++++++++++++++++++++++++
//insertion sort
//        int nums[] = {5,2,1,9,3,4,7,6,8};
//        int size = nums.length;
//
//
//        for(int i = 1; i < size; i++) {
//        int key = nums[i];
//        int j = i-1;
//        while(j >= 0 && nums[j] > key){
//            nums[j+1]=nums[j];
//            j--;
//            }
//        nums[j+1]=key;
//        }
//
//        System.out.println();
//        for(int n: nums) {
//            System.out.print(n + " ");
//        }
//ending insertion sort
//+++++++++++++++++++++++++++++++++++++
//quick sort methode
//        int[] nums = {5,2,1,9,3,4,7,6,8};
//        int size = nums.length;
//
//        quickSort(nums,0,size-1);
//
//        for(int n : nums){
//            System.out.print(n + " ");
//        }
//
//    }
//
//
//    public static void quickSort(int[] nums, int low, int high) {
//        if(low<high) {
//            int pi = partition(nums, low, high);
//
//            quickSort(nums, pi + 1, high);
//            quickSort(nums, low, pi - 1);
//        }
//    }
//
//    private static int partition(int[] nums, int low, int high) {
//        int pivote = nums[high];
//        int i=low-1;
//        for(int j=low ; j<high; j++){
//            if(nums[j]<pivote){
//                i++;
//                int temp = nums[i];
//                nums[i]=nums[j];
//                nums[j]=temp;
//            }
//        }
//        int temp = nums[i+1];
//        nums[i+1] = nums[high];
//        nums[high] = temp;
//
//    return i+1;
//    }
// quick sort ended
//++++++++++++++++++++++++++++++++++++++++++++++
//merge sort
//        int[] nums = {5,2,1,9,3,4,7,6,8};
//        int size = nums.length;
//
//        mergeSort(nums,0,size-1);
//
//        for(int n:nums){
//            System.out.print(n + " ");
//        }
//    }
//    public static void merge(int[] nums,int low,int high,int mid){
//
//        int n1 = mid-low+1;
//        int n2 = high-mid;
//        int[] lArr = new int[n1];
//        int[] rArr = new int[n2];
//        for(int x=0;x<n1;x++){
//            lArr[x] = nums[low+x];
//        }
//        for(int x=0;x<n2;x++){
//            rArr[x] = nums[mid+1+x];
//        }
//        int i = 0;
//        int j = 0;
//        int k = low;
//
//        while (i<n1 && j<n2){
//            if (lArr[i] <= rArr[j]){
//                nums[k] = lArr[i];
//                i++;
//            }else{
//                nums[k] = rArr[j];
//                j++;
//            }
//            k++;
//        }
//        while (i<n1){
//            nums[k] = lArr[i];
//            i++;
//            k++;
//        }
//        while (j<n2){
//            nums[k] = rArr[j];
//            j++;
//            k++;
//        }
//    }
//
//    public static void mergeSort(int[] nums, int low, int high) {
//
//
//        if(low<high) {
//            int mid = (low+high)/2;
//            mergeSort(nums, low, mid);
//            mergeSort(nums, mid + 1, high);
//            merge(nums, low, high, mid);
//        }
//    }
//
//}

//        double a = -3;
//        do{
//
//
//                a = jj(a);
//                if (jj(a) == a) {
//                System.out.println(jj(a));
//            }
//
//        }while(jj(a) < a);
//
//    }
//public static double jj(double aa){
//        return aa - 0.01*2*(aa+5);
//}

    }
}























