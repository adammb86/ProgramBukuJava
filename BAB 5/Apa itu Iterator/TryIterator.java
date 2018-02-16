import java.util.ArrayList;
import java.util.Iterator;

public class TryIterator {

    public static void main(String[] args) {
        ArrayList<Integer> bilanganbulat=new ArrayList<>();

        bilanganbulat.add(10);
        bilanganbulat.add(20);
        bilanganbulat.add(30);
        bilanganbulat.add(40);
        bilanganbulat.add(50);

        Iterator iterator=bilanganbulat.iterator();
        while(iterator.hasNext()){
            Object elemen=iterator.next();
            System.out.println(elemen);
        }
    }
}
