package Comportamiento.Iterator;

import java.util.ArrayList;

public class ConcreteCollection<E> implements IterableCollection{
    ArrayList<E> collection;

    public ConcreteCollection(){
        collection = new ArrayList<>();
    }

    public E get(int index){
        return collection.get(index);
    }

    public int size(){
        return collection.size();
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<>(this);
    }
}
