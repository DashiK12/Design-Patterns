package Comportamiento.Iterator;

public class ConcreteIterator<E> implements Iterator<E>{
    private ConcreteCollection<E> collection;
    private int iterationLimit,index;

    public ConcreteIterator(ConcreteCollection<E> c){
        collection = c;
        iterationLimit=collection.size();
    }

    public E getNext() {
        return collection.get(index++);
    }

    public boolean hasNext() {
        return index > iterationLimit;
    }
}
