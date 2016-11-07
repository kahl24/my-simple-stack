package deqo.kfis;

/**
 * Created by 21309352 on 04/11/2016.
 */
public class Item{


    private int value;


    /**
     * Constructeur
     */
    public Item(int value){
     this.value = value;
    }

    public Item() {

    }

    public int getValue(){
        return this.value;
    }


    public void setValue(int value){
        this.value = value;
    }


}
