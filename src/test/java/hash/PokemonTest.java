package hash;

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