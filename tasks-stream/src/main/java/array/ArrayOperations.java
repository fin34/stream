package array;

public interface ArrayOperations {

    static double getAverage(int[] numbers){

        java.util.Arrays.stream(numbers, 0, numbers.length)
                .forEach(System.out::println);

        return java.util.Arrays.stream(numbers, 0, numbers.length)
                .average().orElse(0);
    }
}
