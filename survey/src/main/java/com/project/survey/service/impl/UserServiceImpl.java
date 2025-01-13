package com.project.survey.service.impl;
import com.project.survey.model.User;
import com.project.survey.service.IUserService;
import java.util.List;

/*
Note: 1- First implement the IUserService interface and override all methods
      2- Then extend the AbstractService class and pass the User and Long as type
      3- You can use 'super' keyword to call the methods of AbstractService class
*/

public class UserServiceImpl extends AbstractService<User,Long> implements IUserService {
    @Override
    public User save(Long id, User object) {
        return super.save(id, object);
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<User> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void update(Long id, User object) {
        super.update(id, object);
    }

}
