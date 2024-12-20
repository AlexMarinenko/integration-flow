package com.balance.integration.service.tax.dto;

import com.balance.integration.commons.dto.WalletResponse;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaxResponse implements WalletResponse {
  private BigDecimal amount;
}
