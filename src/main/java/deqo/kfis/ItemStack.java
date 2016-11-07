package deqo.kfis;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by 21309352 on 04/11/2016.
 *
 *
 */
public class ItemStack implements SimpleStack {


    private int top;
    private List<Item> list;


    public ItemStack() {

        this.list = new ArrayList<Item>();
        top = -1;
    }


    @Override
    public boolean isEmpty() {
        return (this.list.size() == 0);
    }

    @Override
    public int getSize() {
        return this.list.size();
    }

    @Override
    public void push(Item item) {
            top++;
            this.list.add(item);
     }


    @Override
    public Item peek() throws EmptyStackException {

        return this.list.get(top);
    }

    @Override
    public Item pop() throws EmptyStackException {

        if (this.isEmpty())
            throw new EmptyStackException();

        Item item = this.list.get(top);
        this.list.remove(top);
        top--;

        return item;
    }
}
