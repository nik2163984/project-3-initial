import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container<T>{
    private List<T> goods;                              //Creates List

    public Bag() {                                      //Constructor
        this.goods = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {                          //Checks to see if goods List is empty
        return this.goods.isEmpty();
    }

    @Override
    public int size() {                                 //Gets the size of the goods List
        return this.goods.size();
    }

    @Override
    public void add(T item) {                           //Adds item to goods List
        this.goods.add(item);
    }

    @Override
    public String toString() {                          //Outputs the goods List
        final StringBuffer sb = new StringBuffer("Bag{");
        sb.append("goods=").append(goods);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {                     //Returns iterator
        return this.goods.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {   //Performs an action for each item on goods List
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {               //Returns spliterator
        return Container.super.spliterator();
    }
}
