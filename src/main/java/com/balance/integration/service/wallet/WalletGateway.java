package com.balance.integration.service.wallet;

import com.balance.integration.service.wallet.dto.GetBalanceRequest;
import com.balance.integration.service.wallet.dto.GetBalanceResponse;

public interface WalletGateway {
  GetBalanceResponse getBalance(GetBalanceRequest request);
}
