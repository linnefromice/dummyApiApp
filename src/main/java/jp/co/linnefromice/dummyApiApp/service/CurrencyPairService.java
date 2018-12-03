package jp.co.linnefromice.dummyApiApp.service;

import jp.co.linnefromice.dummyApiApp.domain.CurrencyPair;
import jp.co.linnefromice.dummyApiApp.repository.CurrencyPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyPairService {

    @Autowired
    private CurrencyPairRepository currencyPairRepository;

    public CurrencyPair save(CurrencyPair currencyPair) {
        return currencyPairRepository.save(currencyPair);
    }

    public CurrencyPair getOne(String id) {
        return currencyPairRepository.getOne(id);
    }

    public List<CurrencyPair> findAll() {
        return currencyPairRepository.findAll();
    }
}
