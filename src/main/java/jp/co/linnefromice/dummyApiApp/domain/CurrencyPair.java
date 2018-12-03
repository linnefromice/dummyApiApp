package jp.co.linnefromice.dummyApiApp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyPair {

    @Id
    private String id;

    private String currencyPairCode;

    private String settlementCurrency;

    private String keyCurrency;
}