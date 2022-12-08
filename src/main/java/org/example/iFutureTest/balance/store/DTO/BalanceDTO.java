package org.example.iFutureTest.balance.store.DTO;

import lombok.*;
import org.example.iFutureTest.user.store.DTO.UserDTO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanceDTO {
    @NonNull
    private Long id;

    private Long balance;

    @NonNull
    private UserDTO user;

}