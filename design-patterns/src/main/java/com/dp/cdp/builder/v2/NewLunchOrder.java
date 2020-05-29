package com.dp.cdp.builder.v2;

public class NewLunchOrder {

    private String bread;
    private String condiments;
    private String meat;
    private String dressing;

    public NewLunchOrder setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public NewLunchOrder setCondiments(String condiments) {
        this.condiments = condiments;
        return this;
    }

    public NewLunchOrder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public NewLunchOrder setDressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    @Override
    public String toString() {
        return "NewLunchOrder{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", meat='" + meat + '\'' +
                ", dressing='" + dressing + '\'' +
                '}';
    }
}
