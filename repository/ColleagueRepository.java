package source.repository;

import java.util.ArrayList;

import source.model.product.Colleague;

public class ColleagueRepository implements Repository<Colleague> {

    @Override
    public ArrayList<Colleague> read() {
        //파일 입력으로 동료 정보 받아서 List 로 return
        //파일 형식 / name price increaseMoney
                // ex. 동료1 10000 10000
        return null;
    }
    
}
