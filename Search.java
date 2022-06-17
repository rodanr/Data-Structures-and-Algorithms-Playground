public class Search {
    /**
     * Takes list and target and returns the index of the target in the list
     * Returns -1 if the target doesn't exist in the list
     * Two implementations linear search and binary search
     */
    int[] list;
    int target;

    Search(int[] list, int target) {
        this.list = list;
        this.target = target;
    }

    public int linearSearch() {
        // returning -1 means index not found
        // worst case complexity is O(n)
        for (int i = 0; i < this.list.length; i++) {
            if (list[i] == this.target) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch() {
        // returning -1 means index not found
        // worst case complexity and average case complexity is O(logn)
        int start = 0;
        int end = this.list.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // cursorValue points the value at the index given by value of mid
            int cursorValue = list[mid];
            if (cursorValue == this.target) {
                return mid;
            } else if (cursorValue < this.target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Search search = new Search(list, 2);
        // int result = search.linearSearch();
        int result = search.binarySearch();
        if (result == -1) {
            System.out.println("Index not found");
        } else {
            System.out.println("Index: " + String.valueOf(result));
        }
    }
}
