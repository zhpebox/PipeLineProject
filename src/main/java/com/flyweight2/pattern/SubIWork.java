package com.flyweight2.pattern;

public class SubIWork extends IWork {

    private String key;

    public SubIWork(String key) {
        this.key = key;
    }

    @Override
    public void goWhat() {
        System.out.println(" say "+key+" someThing like ……");
    }

}
