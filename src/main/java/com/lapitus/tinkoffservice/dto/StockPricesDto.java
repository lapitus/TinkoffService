package com.lapitus.tinkoffservice.dto;

import com.lapitus.tinkoffservice.model.StockPrice;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@AllArgsConstructor
@Value
public class StockPricesDto {
    private List<StockPrice> stockPrices;
}
