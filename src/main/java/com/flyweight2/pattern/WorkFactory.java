package com.flyweight2.pattern;

import java.util.HashMap;
import java.util.Map;

public class WorkFactory {

    private Map<String,IWork> map = new HashMap<String,IWork>();

    public IWork getIWorkOne(String key){

        IWork work = map.get(key);
        if(work==null){
            work = new SubIWork(key);
            map.put(key,work);
        }

        return work;
    }


    public int getCount(){
        return map.size();
    }

}
