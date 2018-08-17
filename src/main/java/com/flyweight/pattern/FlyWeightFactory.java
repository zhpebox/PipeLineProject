package com.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;


/**
 * 享元工厂，负责创建和管理享元对象
 */
public class FlyWeightFactory {

    private Map<String,FlyWeight> map = new HashMap<String,FlyWeight>();

    /**
     * 获取享元对象
     * @param key
     * @return
     */
    public FlyWeight getFlyWeight(String key){
        FlyWeight flyWeight = map.get(key);
        if(flyWeight == null){
            flyWeight = new SubFlyWeight(key);
            map.put(key,flyWeight);
        }
        return flyWeight;
    }

    /**
     * 获取享元对象的数量
     * @return
     */
    public int getCount(){
        return map.size();
    }

}
