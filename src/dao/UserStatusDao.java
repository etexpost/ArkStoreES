package dao;

import domain.UserStatus;

import java.util.List;

/**
 * Created by Андрей on 04.02.2016.
 */
public interface UserStatusDao {

    Long create(UserStatus userStatus);
    UserStatus read(Long id);
    void update(UserStatus userStatus);
    void delete(UserStatus userStatus);
    List<UserStatus> findAll();

}
