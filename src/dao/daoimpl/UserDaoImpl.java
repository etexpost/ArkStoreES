package dao.daoimpl;

import dao.UserDao;
import domain.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Андрей on 04.02.2016.
 */
public class UserDaoImpl implements UserDao{
    private static Logger log = Logger.getLogger(UserDaoImpl.class);
    private SessionFactory factory;

    public UserDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Long create(User user) {
        Session session = null;
        try {
            session = factory.openSession();
            session.beginTransaction();
            Long id = (Long)session.save(user);
            session.getTransaction().commit();
            return id;
        } catch (HibernateException e) {
            log.error("Open session failed", e);
            if (session != null) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public User read(Long id) {
        Session session = null;
        try {
            session = factory.openSession();
            return (User)session.get(User.class, id);
        }catch (HibernateException e) {
            log.error("Open session failed", e);
            if (session != null) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public void update(User user) {
        Session session = null;
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        }catch (HibernateException e) {
            log.error("Open session failed", e);
            if (session != null) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void delete(User user) {
        Session session = null;
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        }catch (HibernateException e) {
            log.error("Open session failed", e);
            if (session != null) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    @Override
    public List<User> findAll() {
        /*Session session = null;
        try {
            session = factory.openSession();
            return session.createQuery("from User").list();
        }catch (HibernateException e) {
            log.error("Open session failed", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }*/
        return null;
    }
}
