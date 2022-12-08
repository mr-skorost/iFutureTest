package org.example.iFutureTest.balance.store.repository;

import org.example.iFutureTest.balance.store.entity.BalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BalanceRepository extends JpaRepository<BalanceEntity, String> {

}