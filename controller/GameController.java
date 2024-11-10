package source.controller;

import source.model.Poor;
import source.model.store.StoreName;
import source.model.store.StoreService;

public class GameController {
    private Poor poor;
    private StoreService storeService;

    public GameController(Poor poor, StoreService storeService){
        this.poor = poor;
        this.storeService = storeService;
    }

    public void beg(){
        poor.beg();
    }

    public boolean purchaseProduct(StoreName storeName, int ProductIndex){ //성공시 true, 실패시 false
        return storeService.sellProduct(storeName, ProductIndex, poor);
    }

    public void getMoney(int colleagueIndex){
        poor.receiveMoney(colleagueIndex);
    }
}
