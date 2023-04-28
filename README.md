# 해시

### 문제
N미리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, 
N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return하도록 solution 함수를 완성

### 제한사항
- nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
- nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
- 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
- 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
  
### 풀이
`nums`에는 중복값이 존재하므로 선택할 수 있는 최댓값`nums.length/2`과 중복값을 제거한 `Set<Integer>`의 사이즈 중 작은 값을 리턴

```java
//Pokemon.java
import java.util.Arrays;
import java.util.stream.Collectors;

public class Pokemon {
    public int solution(int[] nums) {
        return Math.min(nums.length/2, Arrays.stream(nums).boxed().collect(Collectors.toSet()).size());
    }
}
```

```java
//PokemonTest.java
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class PokemonTest {

    Pokemon pokemon = new Pokemon();

    @Test
    void solution_test() {
        assertThat(pokemon.solution(new int[]{3,1,2,3})).isEqualTo(2);
        assertThat(pokemon.solution(new int[]{3,3,3,2,2,4})).isEqualTo(3);
        assertThat(pokemon.solution(new int[]{3,3,3,2,2,2})).isEqualTo(2);
    }
}
```

```shell
테스트 1 〉	통과 (0.87ms, 73.4MB)  
테스트 2 〉	통과 (1.07ms, 73.1MB)  
테스트 3 〉	통과 (2.56ms, 76.8MB)  
테스트 4 〉	통과 (1.20ms, 73.7MB)  
테스트 5 〉	통과 (0.90ms, 74MB)  
테스트 6 〉	통과 (0.83ms, 76.5MB)  
테스트 7 〉	통과 (1.31ms, 74.8MB)  
테스트 8 〉	통과 (2.93ms, 78.7MB)  
테스트 9 〉	통과 (1.35ms, 83.2MB)  
테스트 10 〉	통과 (1.62ms, 75.1MB)  
테스트 11 〉	통과 (1.03ms, 75.6MB)  
테스트 12 〉	통과 (2.39ms, 77.3MB)  
테스트 13 〉	통과 (2.24ms, 75.8MB)  
테스트 14 〉	통과 (1.79ms, 80.8MB)  
테스트 15 〉	통과 (15.39ms, 77MB)  
테스트 16 〉	통과 (5.79ms, 80.5MB)  
테스트 17 〉	통과 (8.49ms, 81MB)  
테스트 18 〉	통과 (7.33ms, 77MB)  
테스트 19 〉	통과 (7.27ms, 75.6MB)  
테스트 20 〉	통과 (7.60ms, 83.6MB)  
```