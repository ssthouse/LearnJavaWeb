package com.entity;

import com.hibernate_test.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by ssthouse on 21/01/2017.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save(UserEntity userEntity) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(userEntity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public UserEntity findById(int id) {
        UserEntity userEntity = null;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            userEntity = session.get(UserEntity.class, id);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            HibernateUtil.closeSession();
        }
        return userEntity;
    }

    @Override
    public void delete(UserEntity user) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }finally {
            HibernateUtil.closeSession();
        }
    }

    @Override
    public void update(UserEntity userEntity) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(userEntity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }finally {
            HibernateUtil.closeSession();
        }
    }
}
