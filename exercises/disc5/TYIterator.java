public class TYIterator extends OHIterator {
    public TYIterator(OHRequest queue) {
        super(queue);
    }

    @Override
    public boolean hasNext() {
        return super.hasNext();
    }

    @Override
    public OHRequest next() {
        OHRequest result = super.next();
        if (result.description.contains("thank u") && curr != null) {
            curr = curr.next;
        }
        return result;
    }
}