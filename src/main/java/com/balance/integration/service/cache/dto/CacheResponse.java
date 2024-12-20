package com.balance.integration.service.cache.dto;

import com.balance.integration.commons.dto.WalletResponse;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CacheResponse implements WalletResponse {
  private BigDecimal amount;
}
