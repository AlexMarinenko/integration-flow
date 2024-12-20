package com.balance.integration.service.bonus.dto;

import com.balance.integration.commons.dto.WalletResponse;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BonusResponse implements WalletResponse {
  private BigDecimal amount;
}
