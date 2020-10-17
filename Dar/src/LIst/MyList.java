package LIst;

import java.util.Collection;
import java.util.Iterator;

public class MyList <T> implements Collection<T> {


    class Node<T> {
        private T value;
        private Node <T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return (this.next != null ? true : false);
        }
    }

    private Node<T> begin;  // Ссылка на первый элемент
    private long length;
    private Comparable compare;

    public MyList(Comparable comparable) {
        this.begin = null;
        this.length = 0;
        this.compare = comparable;
    }

    public void swap(int firstPos, int secondPos) {
        Node <T> preFirst = indexAt(firstPos - 1);
        Node <T> first = indexAt(firstPos);
        Node <T> aftFirst = indexAt(firstPos + 1);
        Node <T> preSecond = indexAt(secondPos - 1);
        Node <T> second = indexAt(secondPos);
        Node <T> aftSecond = indexAt(secondPos + 1);
        if (preFirst != null) {
            preFirst.setNext(second);
        } else {
            this.begin = second;
        }
        first.setNext(aftSecond);
        if (preSecond == first) {
            second.setNext(first);
        }else {
            second.setNext(aftFirst);
            preSecond.setNext(first);
        }
    }

    public Node<T> indexAt(int index) {
        Node<T> iter = this.begin;
        if (0 <= index && index <= this.length) { // Проверка, что индекс существует в массиве
            for (int i = 0; i < index; i++) { // В этом цикле мы доходим до числа с нашим индексом
                iter = iter.getNext(); // Вызвает следующий элемент
            }
            System.out.println(iter.getValue());
            return  iter;// Возвращает именно ЭЛЕМЕНТ , а не его значение
        }else {
            return null; // В протвном случае выводит null
        }
    }

    public String Output(){
        String result = "[ ";
        Node<T> node = this.begin;
        while (node.hasNext()){
            result +=  node.getValue() + " , ";
            node = node.getNext();
        }
        result += node.getValue();
        result += " ]";
        System.out.println(result);
        return result;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add (T t) {
        Node<T> node = new Node<>(t);
        Node <T> iter = this.begin;
        if (this.begin == null) {
            this.begin = node;
            this.length++;
        } else {
            if (this.begin != null) {
                while (iter.hasNext()) {
                    iter = iter.getNext();
                }
                iter.setNext(node);
                length++;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

}
