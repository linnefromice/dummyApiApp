package jp.co.linnefromice.dummyApiApp.repository;

import jp.co.linnefromice.dummyApiApp.domain.CurrencyPair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyPairRepository extends JpaRepository<CurrencyPair, String> {
}
