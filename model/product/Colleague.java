package source.model.product;

import java.time.LocalDateTime;

import source.model.Poor;

public class Colleague extends Product{
    private int earningMoney;
    private LocalDateTime lastEarnTime;
    private Poor poor;

    public int giveMoney(){
        //시간*earningMoney 계산해서 return
        return 0;
    }
}
