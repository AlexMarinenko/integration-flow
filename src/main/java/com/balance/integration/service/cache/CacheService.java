package com.balance.integration.service.cache;

import com.balance.integration.service.cache.dto.CacheResponse;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    public CacheResponse process() {
        return CacheResponse.builder().amount(BigDecimal.ONE).build();
    }
}
