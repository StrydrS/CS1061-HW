// The insertion-sort algorithm provides an alternative to the selection-sort
// algorithm for sorting something like a hand of cards, where there is a small number of
// items (about 20 or less). It’s more efficient than selection sort if the array is only
// slightly out of order, but it’s relatively inefficient for large numbers of items. The
// following code implements a descending insertion-sort algorithm:

public class chapter9_10 {
   
    public static void insertionSort(int cards[])
    {

        
        long startTime = System.nanoTime();
    
        int n = cards.length;
        for (int i = 1; i < n; ++i) {
            int key = cards[i];
            int j = i - 1;
 
            while (j >= 0 && cards[j] > key) {
                cards[j + 1] = cards[j];
                j = j - 1;
            }
            cards[j + 1] = key;
        }


        //playing with runtime of insertionsort algorithm, O(N^2) 
        // i got the runtime of the algorithm from 1000 ns to 10780601 ns, 10000x increase
        // while only increasing the number of elements from 5 to ~6000, or 1000x increase 
        // so not very efficient for large datasets
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }


    public static void main(String args[])
    {
        int cards[] = { 3, 2, 6, 9, 5 };
 
        chapter9_10.insertionSort(cards);
 
        printArray(cards);
    }

    
};