package com.codesquad.carracing.infrastructure;

import com.codesquad.carracing.domain.RandomGenerator;
import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class BoundedRandomGeneratorTest {
    @Test
    public void 랜덤호출_seed1_bound1() {
        final int seed = 1;
        final int bound = 1;

        final Random random = new Random(seed);
        final RandomGenerator generator = new BoundedRandomGenerator(bound, random);
        final Random random2 = new Random(seed);

        final int number = generator.generate();

        assertThat(number).isEqualTo(random2.nextInt(bound));
    }

    @Test
    public void 랜덤호출_seed5_bound10() {
        final int seed = 5;
        final int bound = 10;

        final Random random = new Random(seed);
        final RandomGenerator generator = new BoundedRandomGenerator(bound, random);
        final Random random2 = new Random(seed);

        final int number = generator.generate();

        assertThat(number).isEqualTo(random2.nextInt(bound));
    }
}
