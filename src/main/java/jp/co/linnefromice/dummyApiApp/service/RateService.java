package jp.co.linnefromice.dummyApiApp.service;

import jp.co.linnefromice.dummyApiApp.domain.Rate;
import jp.co.linnefromice.dummyApiApp.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateService {

    @Autowired
    private RateRepository rateRepository;

    public Rate save(Rate rate) {
        return rateRepository.save(rate);
    }

    public Rate getOne(String id) {
        return rateRepository.getOne(id);
    }

    public List<Rate> findAll() {
        return rateRepository.findAll();
    }
}
