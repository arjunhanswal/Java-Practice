import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 1};
        
        // Step 1: Create a HashMap to store frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Step 2: Count frequency
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 3: Print result
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
