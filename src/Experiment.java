public class Experiment {

    private Sorter sorter;
    private Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(arr);
        } else {
            sorter.advancedSort(arr);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            System.out.println("\nArray size: " + size);

            int[] arr = sorter.generateRandomArray(size);

            int[] arr1 = arr.clone();
            int[] arr2 = arr.clone();


            int[] sortedArr = arr.clone();
            sorter.advancedSort(sortedArr);

            long basicTime = measureSortTime(arr1, "basic");
            long advancedTime = measureSortTime(arr2, "advanced");

            long searchTime = measureSearchTime(arr, arr[size / 2]);

            long sortedTime = measureSortTime(sortedArr.clone(), "basic");

            System.out.println("Bubble Sort (random): " + basicTime);
            System.out.println("Quick Sort (random): " + advancedTime);
            System.out.println("Search time: " + searchTime);
            System.out.println("Bubble Sort (sorted): " + sortedTime);
        }
    }
}