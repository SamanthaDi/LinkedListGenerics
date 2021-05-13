package uaslp.ingenieria.labs.list;

public interface List<T>{
    void add(T data);

    T get(int index) throws MyArrayIndexOutOfBoundsException;

    void delete(int index) throws MyIndexOutOfBoundsException;

    int getSize();

    Iterator<T> getIterator();

    void insert(T data, Position position, Iterator<T> it);

    Iterator<T> getReverseIterator();

}
