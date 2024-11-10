package source.model.store;

import java.util.ArrayList;
import java.util.List;

import source.model.Poor;
import source.model.product.Colleague;
import source.repository.Repository;

public class ColleagueStore extends Store<Colleague>{
    private ArrayList<Colleague> colleagueList = new ArrayList<>();

    public ColleagueStore(Repository<Colleague> repo){
        this.repo = repo;
        addProducts(repo.read());
    }

    @Override
    public boolean sellProduct(int ProductIndex, Poor poor) {
        //poor 객체의 돈, product price 비교 후 구매 가능 여부 판단
        //구매 가능하면 poor의 addProduct 호출
        return true;
    }

    @Override
    public void addProducts(List<Colleague> product) {
        // List 받아서 추가
    }
}
