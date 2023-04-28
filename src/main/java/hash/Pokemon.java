package hash;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Pokemon {
    public int solution(int[] nums) {
        return Math.min(nums.length/2, Arrays.stream(nums).boxed().collect(Collectors.toSet()).size());
    }
}
