package org.example.iFutureTest.balance.store.DTO;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanceDTO {
    @NonNull
    private Long id;
    @NonNull
    private Long balance;

}