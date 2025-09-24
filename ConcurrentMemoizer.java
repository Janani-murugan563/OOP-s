package Class;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
public class ConcurrentMemoizer<K, V> {
    private final ConcurrentHashMap<K, V> cache = new ConcurrentHashMap<>();
    private final Function<K, V> computeFunction;

    public ConcurrentMemoizer(Function<K, V> computeFunction) {
        this.computeFunction = computeFunction;
    }
    public V get(K key) {
        return cache.computeIfAbsent(key, computeFunction);
    }
    public static void main(String[] args) {
    	System.out.println("JANANI M");
    	System.out.println("2117240070123");
        ConcurrentMemoizer<Integer, Long> factorialMemoizer = new ConcurrentMemoizer<>(ConcurrentMemoizer::factorial);

        System.out.println("Factorial of 5: " + factorialMemoizer.get(5));
        System.out.println("Factorial of 6: " + factorialMemoizer.get(6)); // Reuses factorial(5)
        System.out.println("Factorial of 5 again: " + factorialMemoizer.get(5)); // Cached
    }
    private static Long factorial(Integer n) {
        if (n <= 1) return 1L;
        return n * factorial(n - 1);
    }
}
