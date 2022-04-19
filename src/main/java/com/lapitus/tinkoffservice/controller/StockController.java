package com.lapitus.tinkoffservice.controller;

import com.lapitus.tinkoffservice.dto.*;
import com.lapitus.tinkoffservice.model.Stock;
import com.lapitus.tinkoffservice.model.StockPrice;
import com.lapitus.tinkoffservice.service.TinkoffStockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController {
    private final TinkoffStockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStockByTickers(@RequestBody TickersDto tickersDto) {
        return stockService.getStocksByTickers(tickersDto);
    }

    @GetMapping("price/{figi}")
    public StockPrice getPrice(@PathVariable String figi) {
        return stockService.getPrice(figi);
    }

    @PostMapping("prices/getStocksPrices")
    public StockPricesDto getStocksPrices(@RequestBody FigiesDto figiesDto) {
        return stockService.getPrices(figiesDto);
    }


}
