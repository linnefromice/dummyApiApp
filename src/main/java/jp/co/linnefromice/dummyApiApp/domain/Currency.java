package jp.co.linnefromice.dummyApiApp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currency")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Currency {

    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "CURRENCY_NAME")
    private String currencyName;
}
