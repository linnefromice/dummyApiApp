package jp.co.linnefromice.dummyApiApp.api;

import jp.co.linnefromice.dummyApiApp.domain.Rate;
import jp.co.linnefromice.dummyApiApp.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rates")
public class RateRestController {

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
