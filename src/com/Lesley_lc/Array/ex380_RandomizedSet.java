import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ex380_RandomizedSet {
    static List<Integer> nums;
    static Map<Integer, Integer> indices;
    static Random random;

    public static void RandomizedSet() {
        nums = new ArrayList<Integer>();
        indices = new HashMap<Integer, Integer>();  // <val, index in nums>
        random = new Random();
    }
    
    public static boolean insert(int val) {
        if (indices.containsKey(val)) return false;

        int index = nums.size();
        nums.add(val);
        indices.put(val, index);
        return true;
    }
    
    public static boolean remove(int val) {
        if (!indices.containsKey(val)) return false;

        int index = indices.get(val);               // the index of element to be removed in nums
        int last_elem = nums.get(nums.size()-1);    // last element in nums;
        System.out.println("    last_elem = " + last_elem);
        nums.set(index, last_elem);
        nums.remove(nums.size()-1);
        indices.put(last_elem, index);
        indices.remove(val);
        return true;
    }
    
    public static int getRandom() {
        int r = random.nextInt(nums.size());
        return nums.get(r);
    }

    public static void main(String[] args) {
        RandomizedSet();
        System.out.println(insert(1));
        System.out.println(remove(2));
        System.out.println(insert(2));
        System.out.println(getRandom());
        System.out.println(remove(1));
        System.out.println(insert(2));
        System.out.println(getRandom());
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
