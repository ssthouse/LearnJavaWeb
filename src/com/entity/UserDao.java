package com.entity;

/**
 * Created by ssthouse on 21/01/2017.
 */
public interface UserDao {

    void save(UserEntity userEntity);

    UserEntity findById(int id);

    void delete(UserEntity user);

    void update(UserEntity userEntity);
}
