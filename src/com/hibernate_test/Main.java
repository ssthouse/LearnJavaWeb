package com.hibernate_test;

import com.entity.BooksEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by ssthouse on 20/01/2017.
 */
public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        BooksEntity booksEntity;
        booksEntity = session.get(BooksEntity.class, 1);
        System.out.println(booksEntity.getName() + "  " + booksEntity.getAuthor() + "  " + booksEntity.getId());
    }
}
