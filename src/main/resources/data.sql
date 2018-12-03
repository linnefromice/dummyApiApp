-- Currency
insert into currency (currency_code, currency_name) values ('JPY', 'yen');
insert into currency (currency_code, currency_name) values ('USD', 'dollar');
insert into currency (currency_code, currency_name) values ('BTC', 'Bitcoin');
insert into currency (currency_code, currency_name) values ('ETH', 'Ethereum');
insert into currency (currency_code, currency_name) values ('XEM', 'Xenixcoin');
insert into currency (currency_code, currency_name) values ('XRP', 'Ripple');
-- CurrencyPair
insert into currency_pair (id, currency_pair_code, settlement_currency, key_currency) values ('1', 'BTC/JPY', 'BTC', 'JPY');
insert into currency_pair (id, currency_pair_code, settlement_currency, key_currency) values ('2', 'ETH/JPY', 'ETH', 'JPY');
insert into currency_pair (id, currency_pair_code, settlement_currency, key_currency) values ('3', 'XEM/JPY', 'XEM', 'JPY');
insert into currency_pair (id, currency_pair_code, settlement_currency, key_currency) values ('4', 'XRP/JPY', 'XRP', 'JPY');

-- Rate
insert into rate (id,  currency_pair_code, generated_time, market_rate) values ('1', 'BTC/JPY', sysdate, 420000);
insert into rate (id,  currency_pair_code, generated_time, market_rate) values ('2', 'ETH/JPY', sysdate, 12000);
insert into rate (id,  currency_pair_code, generated_time, market_rate) values ('3', 'XEM/JPY', sysdate, 8);
insert into rate (id,  currency_pair_code, generated_time, market_rate) values ('4', 'XRP/JPY', sysdate, 50);
