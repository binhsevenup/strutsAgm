package dao;

import model.Record;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class InDatabaseIRecordDao implements IRecordDao {
//    @SessionTarget
//    Session session;
//    @TransactionTarget
//    Transaction transaction;

//    public void addRecord(Record record) {
//        try {
//            session.saveOrUpdate(record);
//        } catch (Exception e) {
//            transaction.rollback();
//            e.printStackTrace();
//        }
////        Date date = new Date();
////        user.setCreatedAt(date.getTime());
////        user.setUpdatedAt(date.getTime());
//    }

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();
    public List<Record> getAllRecords() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Record> list = em.createQuery("SELECT c FROM Record c", Record.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    public Record getRecordById(String id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Record record = em.find(Record.class, id);
        em.getTransaction().commit();
        em.close();
        return record;
    }

    public void updateRecord(Record record) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Record record1 = em.find(Record.class, record.getId());
        record1.setName(record.getName());
        record1.setSubject(record.getSubject());
        record1.setTheoryS(record.getTheoryS());
        record1.setPracticeS(record.getPracticeS());
        record1.setAssignmentS(record.getAssignmentS());
        record1.setCreatedAt(record.getCreatedAt());
        record1.setUpdatedAt(record.getUpdatedAt());
        em.getTransaction().commit();
        em.close();
    }

    public void addRecord(Record record) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(record);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteRecord(String id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Record record = em.find(Record.class, id);
        em.remove(record);
        em.getTransaction().commit();
        em.close();
    }
}
