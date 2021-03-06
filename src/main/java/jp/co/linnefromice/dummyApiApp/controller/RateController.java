package jp.co.linnefromice.dummyApiApp.controller;

import jp.co.linnefromice.dummyApiApp.domain.Rate;
import jp.co.linnefromice.dummyApiApp.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/rates")
public class RateController {

    @Autowired
    private RateService rateService;

    @GetMapping(path = "findAll")
    public List<Rate> findAll() {
        return rateService.findAll();
    }

    @PostMapping(path = "findOne")
    public Rate findOne(@RequestParam("currencyPairCode") String currencyPairCode) {
        return rateService.getOne(currencyPairCode);
    }
}
