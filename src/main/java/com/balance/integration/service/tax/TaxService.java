package com.balance.integration.service.tax;

import com.balance.integration.service.tax.dto.TaxResponse;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class TaxService {
    public TaxResponse process() {
        return TaxResponse.builder().amount(BigDecimal.TEN).build();
    }
}
