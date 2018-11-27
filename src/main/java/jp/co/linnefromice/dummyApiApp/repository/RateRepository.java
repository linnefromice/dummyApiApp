package jp.co.linnefromice.dummyApiApp.repository;

import jp.co.linnefromice.dummyApiApp.domain.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rate, String> {
}
