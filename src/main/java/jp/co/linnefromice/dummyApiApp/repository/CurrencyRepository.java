package jp.co.linnefromice.dummyApiApp.repository;

import jp.co.linnefromice.dummyApiApp.domain.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, String> {
}
