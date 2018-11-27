-- Currency
insert into Currency (id, currency_code, currency_name) values ('1', 'JPY', 'yen');
insert into Currency (id, currency_code, currency_name) values ('2', 'USD', 'dollar');
insert into Currency (id, currency_code, currency_name) values ('3', 'BTC', 'Bitcoin');
insert into Currency (id, currency_code, currency_name) values ('4', 'ETH', 'Ethereum');
insert into Currency (id, currency_code, currency_name) values ('5', 'XEM', 'Xenixcoin');
insert into Currency (id, currency_code, currency_name) values ('6', 'XRP', 'Ripple');
-- Rate
insert into Rate (id, generated_time, from_currency_code, to_currency_code, market_rate) values ('1', sysdate, 'JPY', 'BTC', 420000);
insert into Rate (id, generated_time, from_currency_code, to_currency_code, market_rate) values ('2', sysdate, 'JPY', 'ETH', 12000);
insert into Rate (id, generated_time, from_currency_code, to_currency_code, market_rate) values ('3', sysdate, 'JPY', 'XEM', 8);
insert into Rate (id, generated_time, from_currency_code, to_currency_code, market_rate) values ('4', sysdate, 'JPY', 'XRP', 50);