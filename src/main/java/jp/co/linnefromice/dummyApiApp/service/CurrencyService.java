package jp.co.linnefromice.dummyApiApp.service;

import jp.co.linnefromice.dummyApiApp.domain.Currency;
import jp.co.linnefromice.dummyApiApp.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public Currency save(Currency currency) {
        return currencyRepository.save(currency);
    }

    public Currency getOne(String id) {
        return currencyRepository.getOne(id);
    }

    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }
}
