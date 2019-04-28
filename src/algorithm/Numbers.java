package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[10];
        storeRandomNumbers(num);
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
        int n = num.length;
        randomize(num, n);
        //Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "Insert_sort", "SortingNumbers");
        printValue(numbers);
        randomize(num, n);


        //By following above, Continue for rest of the Sorting Algorithm....
        //bubblesort
        algo.bubbleSort(num);
        long boubbleSortExecutionTime =algo.executionTime;
        System.out.println("total execution time of "+num.length+ "number in insertion sort take "+boubbleSortExecutionTime+ "mil sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_Sort", "SortingNumbers");
        printValue(numbers);
        randomize(num,n);
        //quick Sort
        //algo.quickSort(num);
        //long quickSortExecutionTime =algo.executionTime;
        //System.out.println("total execution time of "+num.length+ "number in insertion sort take "+quickSortExecutionTime+ "mil sec");
        //connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_Sort", "SortingNumbers");
        //printValue(numbers);
        //randomize(num,n);
        //heap sort*
        algo.heapSort(num);
        long heapSortExecutionTime =algo.executionTime;
        System.out.println("total execution time of "+num.length+ "number in insertion sort take "+heapSortExecutionTime+ "mil sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_Sort", "SortingNumbers");
        printValue(numbers);
        randomize(num,n);
        //bucket_sort
        algo.bucketSort(num);
        long bucketSortExecutionTime =algo.executionTime;
        System.out.println("total execution time of "+num.length+ "number in insertion sort take "+bucketSortExecutionTime+ "mil sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_Sort", "SortingNumbers");
        printValue(numbers);
        randomize(num,n);
        //shell sort
        algo.shellSort(num);
        long shellSortExecutionTime =algo.executionTime;
        System.out.println("total execution time of "+num.length+ "number in insertion sort take "+shellSortExecutionTime+ "mil sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_Sort", "SortingNumbers");
        printValue(numbers);
        randomize(num,n);
        // Come to conclusion about which Sorting Algo is better in given data set.

    }

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int arr[], int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
