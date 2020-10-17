package LIst;

public class Main {

    public static void main(String[] args) {
        MyList <String> myList = new MyList((a, b) -> {

        });
        myList.add("Стрелка");
        myList.add("Белка");
        myList.add("Топор");
        MyList <Integer> myList2  = new MyList();
        myList2.add(9);
        myList2.add(1);
        myList2.add(19);
        myList.Output();
        myList2.Output();
        myList2.indexAt(0).getValue();
    }
}
