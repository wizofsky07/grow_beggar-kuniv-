package source.model;

import java.util.*;

import source.model.product.Colleague;
import source.model.product.Item;
import source.model.product.Product;
import source.model.store.StoreName;

public class Poor {
    private int totalMoney; //소지한 돈
    private int beggedMoney; // 구걸 1회당 얻는 돈
    private ArrayList<Item> itemList;
    private ArrayList<Colleague> colleagueList;

    public void beg(){
        // 구걸 로직
    }
    public void receiveMoney(int colleagueIndex){
        // 돈 회수 로직
    }
    public boolean addProduct(Product product) {
        if (product instanceof Item) {
            itemList.add((Item) product);
            return true;
        }
        if (product instanceof Colleague) {
            colleagueList.add((Colleague) product);
            return true;
        }
        return false;
    }
}
