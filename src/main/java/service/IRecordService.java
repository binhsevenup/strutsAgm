package service;

import dao.InDatabaseIRecordDao;
import dao.IRecordDao;
import model.Record;

import java.util.Calendar;
import java.util.List;

public class IRecordService implements IRecordDao {
    private IRecordDao iRecordDao = new InDatabaseIRecordDao();

    public List<Record> getAllRecords() {
        return iRecordDao.getAllRecords();
    }

    public Record getRecordById(String id) {
        return iRecordDao.getRecordById(id);
    }

    public void updateRecord(Record record) {
        record.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        iRecordDao.updateRecord(record);
    }

    public void addRecord(Record record) {
        record.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        record.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        iRecordDao.addRecord(record);
    }

    public void deleteRecord(String id) {
        iRecordDao.deleteRecord(id);
    }
}
