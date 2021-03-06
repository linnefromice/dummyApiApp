package jp.co.linnefromice.dummyApiApp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String currencyCode;

    private String currencyName;
}
