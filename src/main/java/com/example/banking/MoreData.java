package com.example.banking;

//remember ! no annotation for Java configured bean/class!
//the advantage? You can use existing classess as beans without
//touching the source code
public class MoreData {
    private String someData;

    public MoreData(String aSomeData) {
        this.someData = aSomeData;
    }

    public String getSomeData() {
        return someData;
    }
}
