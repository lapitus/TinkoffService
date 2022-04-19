package com.lapitus.tinkoffservice.service;

import com.lapitus.tinkoffservice.dto.*;
import com.lapitus.tinkoffservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
    StocksDto getStocksByTickers(TickersDto tickers);
    StockPrice getPrice(String figi);
    StockPricesDto getPrices(FigiesDto figiesDto);

}
