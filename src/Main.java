public class Main {
    public static void main(String[] args) {


        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();


        Experiment exp = new Experiment(sorter, searcher);


        int[] arr = sorter.generateRandomArray(10);

        System.out.println("Original array:");
        sorter.printArray(arr);

        sorter.basicSort(arr);

        System.out.println("Sorted array:");
        sorter.printArray(arr);


        System.out.println("\n = = = Experiments = = =");
        exp.runAllExperiments();
    }
}