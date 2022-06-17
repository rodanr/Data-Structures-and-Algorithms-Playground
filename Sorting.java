public class Sorting {
    public int[] bubbleSort(int[] list) {
        int lengthOfList = list.length;
        for (int j = 1; j < lengthOfList; j++) {
            for (int i = 0; i < lengthOfList - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] listToSort = { 10, 12, 13, 14, 15, 19, 16, 17, 18, 8, 7, 9, 6, 4, 5, 1, 3, 2, 11 };
        int[] sortedList = sorting.bubbleSort(listToSort);
        String sortedListStringRep = "";
        for (int i : sortedList) {
            sortedListStringRep += String.valueOf(i) + ",";
        }
        System.out.println(sortedListStringRep);
    }
}