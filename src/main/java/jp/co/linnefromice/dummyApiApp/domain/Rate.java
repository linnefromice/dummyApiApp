package jp.co.linnefromice.dummyApiApp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "rate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rate {

    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "GENERATED_TIME")
    private Date generatedTime;
    @Column(name = "FROM_CURRENCY_CODE")
    private String fromCurrencyCode;
    @Column(name = "TO_CURRENCY_CODE")
    private String toCurrencyCode;
    @Column(name = "MARKET_RATE")
    private BigDecimal marketRate;
}
