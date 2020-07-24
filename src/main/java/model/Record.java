package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "record")
public class Record implements Serializable {
    @Id
    private String id; //auto
    @Column(name = "name")
    private String name; //10-30 r
    @Column(name = "subject")
    private String subject; //r
    @Column(name = "theoryScore")
    private Integer theoryS; //0-100 r
    @Column(name = "practiceScore")
    private Integer practiceS; //0-15 r
    @Column(name = "assignmentScore")
    private Integer assignmentS; //0-10 r
    @Column(name = "createdAt")
    private Long createdAt; //0-10 r
    @Column(name = "updatedAt")
    private Long updatedAt; //0-10 r

    public Record() {
    }

    public Record(String id, String subject, String name, Integer theoryS, Integer practiceS, Integer assignmentS, Long createdAt, Long updatedAt) {
        this.id = id;
        this.subject = subject;
        this.name = name;
        this.theoryS = theoryS;
        this.practiceS = practiceS;
        this.assignmentS = assignmentS;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTheoryS() {
        return theoryS;
    }

    public void setTheoryS(Integer theoryS) {
        this.theoryS = theoryS;
    }

    public Integer getPracticeS() {
        return practiceS;
    }

    public void setPracticeS(Integer practiceS) {
        this.practiceS = practiceS;
    }

    public Integer getAssignmentS() {
        return assignmentS;
    }

    public void setAssignmentS(Integer assignmentS) {
        this.assignmentS = assignmentS;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
