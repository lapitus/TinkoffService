package com.lapitus.tinkoffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@AllArgsConstructor
@Value
@Getter
@Setter
public class StockPrice {
    String figi;
    Double price;
}
