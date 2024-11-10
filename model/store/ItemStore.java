package source.model.store;

import java.util.ArrayList;
import java.util.List;

import source.model.Poor;
import source.model.product.Item;
import source.repository.Repository;

public class ItemStore extends Store<Item>{
    private ArrayList<Item> itemList = new ArrayList<>();

    public ItemStore(Repository<Item> repo){
        this.repo = repo;
        addProducts(repo.read());
    }

    @Override
    public boolean sellProduct(int ProductIndex, Poor poor) {
        //Colleague 처럼
        return true;
    }

    @Override
    public void addProducts(List<Item> product) {
        //파라미터로 받은거 itemList에 추가
    }
}
