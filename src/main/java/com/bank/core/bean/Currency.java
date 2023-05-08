package com.bank.core.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Currency {

	private String country;
	private String currencyName;
	private String charCode;
	private String numericCode;
}
