package source.model.store;

import java.util.HashMap;

import source.model.Poor;
import source.model.product.Product;
import source.repository.ColleagueRepository;
import source.repository.ItemRepository;

public class StoreService {
    private ItemStore itemStore;
    private ColleagueStore colleagueStore;
    private HashMap<StoreName, Store<? extends Product>> stores = new HashMap<>();
    
    public StoreService(ItemRepository itemRepo, ColleagueRepository colleagueRepo) {
        this.itemStore = new ItemStore(itemRepo);
        this.colleagueStore = new ColleagueStore(colleagueRepo);
        stores.put(StoreName.Item, itemStore);
        stores.put(StoreName.Colleague, colleagueStore);
    }

    public boolean purchaseProduct(StoreName storeName, int productIndex, Poor poor){ //성공시 true, 실패시 false
        Store<? extends Product> store = stores.get(storeName);
        return store.sellProduct(productIndex, poor);
    }
}
