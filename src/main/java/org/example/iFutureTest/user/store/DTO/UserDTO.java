package org.example.iFutureTest.user.store.DTO;

import lombok.*;
import org.example.iFutureTest.balance.store.DTO.BalanceDTO;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NonNull
    private Long id;

    @NonNull
    private String name;

    private List<BalanceDTO> balances;
}
