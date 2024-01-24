public class chapter9_10 {
    public static void main(String[] args) {
        int[] preSort = new int[] {3, 2, 6, 9, 5};

        for(int i = 0; i < preSort.length; i++) {
            System.out.print(preSort[i] + " ");
        }
        System.out.println();
        int[] postSort = insertionSort(preSort);

        for(int i = 0; i < postSort.length; i++) {
            System.out.print(postSort[i] + " ");
        }
    }

    private static int[] insertionSort(int[] cards) {
        int pick;
        int j;

        for(int i = 1; i < cards.length; i++) {
            pick = cards[i];

            for(j = 1; j > 0 && pick > cards[j-1]; j--) {
                cards[j] = cards[j-1];
            }
            cards[j] = pick;
        }

        return cards;
    }
    }