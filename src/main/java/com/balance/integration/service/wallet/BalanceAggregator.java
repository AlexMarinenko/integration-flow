package com.balance.integration.service.wallet;

import com.balance.integration.commons.dto.WalletResponse;
import com.balance.integration.service.bonus.dto.BonusResponse;
import com.balance.integration.service.cache.dto.CacheResponse;
import com.balance.integration.service.tax.dto.TaxResponse;
import com.balance.integration.service.wallet.dto.GetBalanceResponse;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BalanceAggregator {

  public GetBalanceResponse aggregate(List<WalletResponse> items) {
    GetBalanceResponse result = new GetBalanceResponse();
    items.forEach(item -> {
      switch (item) {
        case CacheResponse cacheResponse -> result.setCache(cacheResponse.getAmount());
        case BonusResponse bonusResponse -> result.setBonus(bonusResponse.getAmount());
        case TaxResponse taxResponse -> result.setTax(taxResponse.getAmount());
        default -> throw new IllegalStateException("Unexpected value: " + item);
      }
    });
    return result;
  }
}
