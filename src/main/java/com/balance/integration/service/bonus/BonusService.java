package com.balance.integration.service.bonus;

import com.balance.integration.service.bonus.dto.BonusResponse;
import java.math.BigDecimal;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class BonusService {
    @ServiceActivator
    public BonusResponse process() {
        return BonusResponse.builder().amount(BigDecimal.TWO).build();
    }
}
