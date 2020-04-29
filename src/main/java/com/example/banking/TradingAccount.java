package com.example.banking;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("trading")
public class TradingAccount implements Transferable {
    @Override
    public String transferMoney() {
        return "transferred from Trading Account";
    }
}
