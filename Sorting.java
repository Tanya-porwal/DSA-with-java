public class Sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSort(int[] arr){
        System.out.println("array for  bubble sort:");
        printArray(arr);

        
        System.out.println();
        System.out.println("Array after bubble sort: ");
        printArray(arr);
        System.out.println();
    }

    public static void selectionSort(int[] arr){ 
        System.out.println();
        System.out.println("array for  selection sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after selection sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void insertionSort(int[] arr){
        System.out.println();
        System.out.println("array for insertion sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after insertion sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void mergeSort(int[] arr){
        System.out.println();
        System.out.println("array for  merge sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after merge sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void quickSort(int[] arr){
        System.out.println();
        System.out.println("array for quick sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after quick sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void heapSort(int[] arr){
        System.out.println();
        System.out.println("array for heap sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after heap sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void countingSort(int[] arr){
        System.out.println();
        System.out.println("array for counting sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after counting sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void radixSort(int[] arr){
        System.out.println();
        System.out.println("array for radix sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after radix sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void bucketSort(int[] arr){
        System.out.println();
        System.out.println("array for bucket sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after bucket sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void shellSort(int[] arr){
        System.out.println();
        System.out.println("array for shell sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after shell sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void timSort(int[] arr){
        System.out.println();
        System.out.println("array for tim sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after tim sort: ");
        printArray(arr);
        System.out.println();

    }
    public static void cocktailShakerSort(int[] arr){
        System.out.println();
        System.out.println("array for cocktail Shaker sort:");
        printArray(arr);


        System.out.println();
        System.out.println("Array after cocktail Shaker sort: ");
        printArray(arr);
        System.out.println();

    }
    
    public static void main(String[] args){
        int a[]={1,7,9,3,6,5};
        bubbleSort(a);

        int b[]={5,7,9,0,2,4,6,8};
        selectionSort(b);

        int c[]={5,7,9,0,2,4,1,8};
        insertionSort(c);
        
        int d[] = {};
        mergeSort(d);

        // int e[] = {};
        // quickSort(e);
        
        // int f[] = {};
        // heapSort(f);
        
        // int g[] = {};
        // countingSort(g);
        
        // int h[] = {};
        // radixSort(h);
        
        // int  i[] = {};
        // bucketSort(i);
        
        // int j[] = {};
        // shellSort(j);
        
        // int k[] = {};
        // timSort(k);
        
        // int l[] = {};
        // cocktailShakerSort(l);
    } 

}












