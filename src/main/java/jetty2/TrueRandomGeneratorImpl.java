package jetty2;

import java.util.Random;

public class TrueRandomGeneratorImpl implements TrueRandomGenerator {
    public int getRandomValue() {
        Random random = new Random();
        return random.nextInt();
    }
}
