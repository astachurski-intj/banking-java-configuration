package com.example.banking;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("daily")
public class DailyAccount implements Transferable {
    @Override
    public String transferMoney() {
        return "transferred from daily account";
    }
}
