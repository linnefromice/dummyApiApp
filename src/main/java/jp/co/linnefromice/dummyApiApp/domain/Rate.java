package jp.co.linnefromice.dummyApiApp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "rate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rate {

    @Id
    private String id;

    private String currencyPairCode;

    private BigDecimal marketRate;

    private Date generatedTime;
}
