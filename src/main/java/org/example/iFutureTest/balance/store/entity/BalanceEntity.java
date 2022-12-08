package org.example.iFutureTest.balance.store.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.iFutureTest.user.store.entity.UserEntity;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
public class BalanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long balance;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    private UserEntity userEntity;

    public BalanceEntity(Long id, Long balance, UserEntity userEntity) {
        this.id = id;
        this.balance = balance;
        this.userEntity = userEntity;
    }


}