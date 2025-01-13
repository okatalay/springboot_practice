package com.project.survey.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractService<T,ID> {

    Map<ID,T> map = new HashMap<>();  //Custom DB

    T save(ID id, T object){
        return map.put(id,object);
    }

    T findById(ID id){
        return map.get(id);
    }

    List<T> findAll(){
        return (List<T>) map.values();
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void update(ID id, T object){
        map.put(id,object);
    }

}
