package com.project.survey.service;

// T-> Represents to the type of the object
// ID-> Represents to the type of the id of the object

import java.util.List;

public interface ICrudService<T,ID> {

    T save(ID id,T object);
    T findById(ID id);
    List<T> findAll();
    void deleteById(ID id);
    void update(ID id,T object);

}
