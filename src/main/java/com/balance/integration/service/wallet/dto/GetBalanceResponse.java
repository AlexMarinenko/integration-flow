package com.balance.integration.service.wallet.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class GetBalanceResponse {
  private BigDecimal cache;
  private BigDecimal bonus;
  private BigDecimal tax;
}
