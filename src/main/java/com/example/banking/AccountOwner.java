package com.example.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountOwner {

    @Autowired
    //@Qualifier("daily")
    @Qualifier("trading")
    Transferable transferable;

    @Autowired // <--- field injection
    private List<Child> children;

    @Autowired
    private MoreData moreData;

    //@Autowired <-- we user setter injection method below
    private ClientDetails clientDetails;

    private final String name = "Amit";

    @Autowired
    public void setClientDetails(ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    public String getMoney() throws Exception {
        if (clientDetails.getName().equals(this.name)) {
            for (Child ch : children) {
                System.out.println(ch.getName());
            }
            System.out.println("is there more user data? ");
            System.out.println(moreData.getSomeData());
            return transferable.transferMoney();
        } else
            throw new Exception("no such user");
    }


}
