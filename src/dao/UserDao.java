package dao;

import domain.User;

import java.util.List;



/**
 * Created by Андрей on 04.02.2016.
 */
public interface UserDao {

    Long create(User user);
    User read(Long id);
    void update(User user);
    void delete(User user);
    List<User> findAll();
}
