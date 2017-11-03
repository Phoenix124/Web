package dao;

import model.Manufacter;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ManufacterDAOImpl implements ManufacterDAO {

    private static final Logger logger = LoggerFactory.getLogger(ManufacterDAOImpl.class);

    public void addManufacter(Manufacter manufacter) {
        Session session = HibernateLoader.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(manufacter);
        session.flush();
        session.getTransaction().commit();
        logger.info("Manufacter successfully added. Details: " + manufacter);
    }

    public Manufacter getById(int id) {
        Session session = HibernateLoader.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Manufacter manufacter = session.get(Manufacter.class, id);
        if (manufacter != null) {
            session.getTransaction().commit();
        } else session.getTransaction().rollback();
        logger.info("Manufacter successfully loaded. Details: " + manufacter);

        return manufacter;
    }

    public void updateManufacter(Manufacter manyfacter) {
        Session session = HibernateLoader.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        session.update(manyfacter);
        session.getTransaction().commit();
        logger.info("Manufacter successfully updated. Details: " + manyfacter);
    }

    public void deleteManufacter(int id) {
        Session session = HibernateLoader.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Manufacter manufacter = session.get(Manufacter.class, id);
        if (manufacter != null) {
            session.delete(manufacter);
            session.getTransaction().commit();
        } else session.getTransaction().rollback();
        logger.info("Manufacter successfully deleted. Details: " + manufacter);
    }

    public List<Manufacter> getAll() {
        Session session = HibernateLoader.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Manufacter> list = session.createQuery("from Manufacter ", Manufacter.class).list();
        for (Manufacter manufacter : list) {
            logger.info("Manufacter list: " + manufacter);
        }
        session.getTransaction().commit();
        return list;
    }
}