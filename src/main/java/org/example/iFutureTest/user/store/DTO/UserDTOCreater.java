package org.example.iFutureTest.user.store.DTO;

import org.example.iFutureTest.balance.store.DTO.BalanceDTOCreator;
import org.example.iFutureTest.user.store.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UserDTOCreater {

    private final BalanceDTOCreator balanceDTOCreator;

    public UserDTOCreater(@Autowired BalanceDTOCreator balanceDTOCreator) {
        this.balanceDTOCreator = balanceDTOCreator;
    }

    public UserDTO makeUserDTO(UserEntity entity) {
        return UserDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .balances(entity
                        .getBalances()
                        .stream()
                        .map(balanceDTOCreator::makeBalanceDTO)
                        .collect(Collectors.toList()))
                .build();
    }
}
