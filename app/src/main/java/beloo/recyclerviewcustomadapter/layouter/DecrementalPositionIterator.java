package beloo.recyclerviewcustomadapter.layouter;

class DecrementalPositionIterator extends AbstractPositionIterator {

    @Override
    public boolean hasNext() {
        return pos >= 0;
    }

    @Override
    public Integer next() {
        return pos--;
    }

}
