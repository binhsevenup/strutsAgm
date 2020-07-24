package dao;

import model.Record;

import java.util.List;

public interface IRecordDao {
    void addRecord(Record record);
    void updateRecord(Record record);
    List<Record> getAllRecords();
    Record getRecordById(String id);
    void deleteRecord(String id);
}
