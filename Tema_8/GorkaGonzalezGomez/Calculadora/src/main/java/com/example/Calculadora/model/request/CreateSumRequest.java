package com.example.Calculadora.model.request;

import com.example.Calculadora.model.pojo.sums.SumOperandsDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateSumRequest {
    private SumOperandsDTO operands;
}
