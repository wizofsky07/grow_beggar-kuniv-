package source.repository;

import java.util.ArrayList;

import source.model.product.Item;

public class ItemRepository implements Repository<Item> {

    @Override
    public ArrayList<Item> read() {
        //파일 입력으로 아이템 정보 받아서 return
        return null;
    }
    
}
