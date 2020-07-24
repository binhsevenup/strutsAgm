package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Record;
import service.IRecordService;

import java.util.List;

public class RecordAction extends ActionSupport {
    private IRecordService iRecordService = new IRecordService();
    private Record record = new Record();
    private List<Record> records;
    private String id;

    public String createRecord() {
        return INPUT;
    }

    public String update() {
        iRecordService.updateRecord(record);
        return SUCCESS;
    }

    public String save() {
        iRecordService.addRecord(record);
        return SUCCESS;
    }

    public String list() {
        records = iRecordService.getAllRecords();
        return SUCCESS;
    }

    public String getStudentById() {
        record = iRecordService.getRecordById(id);
        return INPUT;
    }

    public String delete() {
        iRecordService.deleteRecord(record.getId());
        return SUCCESS;
    }

    public void validateSave() {
        if (record.getId() == null || record.getId().isEmpty()) {
            addFieldError("record.id", getText("Please enter id for student!"));
        } else if (record.getId().length() != 7) {
            addFieldError("record.id", getText("The id must be 7 characters."));
        }
        if (record.getSubject() == null || record.getSubject().isEmpty()) {
            addFieldError("record.subject", getText("Please enter name for subject!"));
        }
        if (record.getName() == null || record.getName().isEmpty()) {
            addFieldError("record.name", getText("Please enter name for student!"));
        } else if (record.getName().length() < 10 && record.getName().length() > 30) {
            addFieldError("record.name", getText("Name student between 10 and 30 characters!"));
        }
        if (record.getTheoryS() > 100 || record.getTheoryS() < 0) {
            addFieldError("record.theoryS", getText("Value of theory point must be between 0 and 100."));
        }
        if (record.getPracticeS() > 15 | record.getPracticeS() < 0) {
            addFieldError("record.practiceS", getText("Value of practice point must be between 0 and 15."));
        }
        if (record.getAssignmentS() > 10 || record.getAssignmentS() < 0) {
            addFieldError("record.assignmentS", getText("Value of assignment point must be between 0 and 10."));
        }
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IRecordService getiRecordService() {
        return iRecordService;
    }

    public void setiRecordService(IRecordService iRecordService) {
        this.iRecordService = iRecordService;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
