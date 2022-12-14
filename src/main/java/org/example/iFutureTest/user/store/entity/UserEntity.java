package org.example.iFutureTest.user.store.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.iFutureTest.balance.store.entity.BalanceEntity;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user")
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "user")
    private List<BalanceEntity> balances;

    public UserEntity(Long id, String name, List<BalanceEntity> balances) {
        this.id = id;
        this.name = name;
        this.balances = balances;
    }

    public UserEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
