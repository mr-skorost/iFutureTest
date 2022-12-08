package org.example.iFutureTest.balance.store.DTO;

import org.example.iFutureTest.balance.store.entity.BalanceEntity;
import org.springframework.stereotype.Component;


@Component
public class BalanceDtoCreator {

    public BalanceDTO makeBalanceDTO(BalanceEntity entity){
        return BalanceDTO.builder()
                .id(entity.getId())
                .balance(entity.getId())
                .build();
    }
}
