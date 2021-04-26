package uaslp.ingenieria.labs.list;
import uaslp.ingenieria.labs.list.Iterator;

public class ArrayList<H> implements List<H> {

    private Object[] array;
    private int size;

    public ArrayList() {
        this.array = new Object[2];
    }

    @Override
    public void add(H data) {
        if (size >= array.length) {
            Object[] arrayN = new Object[array.length + 2];
            System.arraycopy(array, 0, arrayN, 0, array.length);
            this.array = arrayN;
        }
        this.array[size] = data;
        size++;
    }

    @Override
    public H get(int index) {
        return (H) array[index];
    }

    @Override
    public void delete(int index) {
        if(index <0 && index >= size)
            return;
        int currentIndex;
        for (currentIndex = index+1; currentIndex < size; currentIndex++){
            this.array[currentIndex -1] = this.array[currentIndex];
        }
        size--;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<H> getIterator() {
        return new ForwardIterator();
    }

    @Override
    public void insert(H data, Position position, Iterator<H> it) {

    }

    @Override
    public Iterator<H> getReverseIterator() {
        return new ReverseIterator();
    }

    public class ForwardIterator implements Iterator<H> {

        private int currentIndex;

        @Override
        public boolean hasNext(){
            return currentIndex < size;
        }

        public H next(){

            return (H)array[currentIndex++];
        }
    }

    public class ReverseIterator implements Iterator<H>{
        private int currentIndex;
        public ReverseIterator() {
            this.currentIndex = size-1;
        }
        @Override
        public boolean hasNext(){
            return currentIndex > 0;
        }

        public H next(){
            H data = (H)array[currentIndex];
            currentIndex--;
            return data;
        }
    }
}
