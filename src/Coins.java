import java.util.Iterator;

public class Coins implements Iterable<Integer>, Iterator<Integer> {

    private final int[] Values;

    private int Index = -1;

    public Coins(int... values) {
        this.Values = values;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        boolean hasNext = (Index < Values.length - 1);

        if (!hasNext) {
            Index = -1;
        }

        return hasNext;
    }

    @Override
    public Integer next() {
        Index++;
        return Values[Index];
    }
}
