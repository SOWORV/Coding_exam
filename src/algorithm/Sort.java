package algorithm;

public class Sort {
    long executionTime = 0;
/*
 * Please implement all the sorting algorithm. Feel free to add helper methods.
 * Store all the sorted data into one of the databases.
 */
//Selection Sort
public int[] selectionSort(int [] array){
    final long startTime = System.currentTimeMillis();
    int [] list = array;

    for(int i=0; i<array.length; i++){
        for(int j=i+1; j<array.length; j++){
            if(array[j]<array[i]){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
    }
    final long endTime = System.currentTimeMillis();
    final long executionTime = endTime - startTime;
    this.executionTime = executionTime;
    System.out.println(list);
    return list;
}
    //Insertion Sort
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int in, out;
        for(out=1; out<array.length; out++)
        {
            int temp = array[out];
            in = out;
            while(in>0 && array[in-1] >= temp)
            {
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //Bubble Sort
    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for (int a =0;a<array.length;a++){
            for(int b=0;b<array.length;b++){
                if(array[b] >array[b+1]){
                    int temp = array[b];
                    array[b] = array[b+1];
                    array[b+1] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //Merge Sort
    public  void MergeSort(int[] array) {
    }
    //Quick Sort
    public int [] quickSort(int [] array, int low, int high){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if(low < high){
            int next = partition(array, low, high);
            quickSort(array, low, next-1);
            quickSort(array, next+1, high);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int partition(int array[], int p, int r){
        int part = p-1;
        int pivot = array[r];
        for(int i=p; i <= r; i++){
            if(array[i] <= pivot){
                part++;
                if(part != i){
                    array[part] = array[part] ^ array[i];
                    array[i] = array[part] ^ array[i];
                    array[part] = array[part] ^ array[i];
                }
            }
        }
        return part;
    }
    //Heap Sort
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        buildHeap(array);
        for(int i = array.length-1; i>=1; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapfy(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public void buildHeap(int[] array){
        for(int i=array.length/2-1; i >= 0; i--){
            heapfy(array, array.length, i);
        }
    }
    public void heapfy(int [] array, int n, int i){
    int max;
    int child;
    child =2*i+1;
    max = i;
    if(child <n){
        if(array[child]>array[max]){
            max = child;
        }
        if(child+1< n){
            if (array[child+1]>array[max]) {
                max=child+1;
            }
        }
        if(max!=i){
            int temp = array[i];
            array[i] = array[max];
            array[max]= temp;
            heapfy(array,n,max);
        }
    }
    }
    //Bucket Sort
    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int maxVal = getMax(array);
        int[] bucket = new int[maxVal+1];
        for(int i=0; i<bucket.length; i++){
            bucket[i] = 0;
        }
        for(int i=0; i<array.length; i++){
            bucket[array[i]]++;
        }
        int outPos = 0;
        for(int i=0; i<bucket.length; i++){
            for(int j=0; j<bucket[i]; j++){
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    // get max
    public int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //Shell Sort
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        int inner, outer;
        int temp;
        int h = 1;
        while(h <= array.length/3)
            h = h*3 + 1;
        while(h>0)
        {
            for(outer=h; outer<array.length; outer++)
            {
                temp = list[outer];
                inner = outer;
                while(inner > h-1 && list[inner-h] >= temp)
                {
                    list[inner] = list[inner-h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h-1) / 3;
        }
        return list;
    }
    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}







