import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max+1;
        Random random1 = new Random();
        int i;
        while (true) {
            i = random1.nextInt(max - min) + min;
            if (i > min & i < max) {
                this.random = random1;
                break;
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iter();
    }

    public class Iter implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {
            return random.nextInt(max - min) + min;
        }
    }
}
