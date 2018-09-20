package com.barclays.oneappdemo.dto;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "APP_TNC")
public class TnCDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int term_id;
    private String term_desc;
    @Version
    private Timestamp last_modified_date;

    public int getTerm_id() {
        return term_id;
    }

    public void setTerm_id(int term_id) {
        this.term_id = term_id;
    }

    public String getTerm_desc() {
        return term_desc;
    }

    public void setTerm_desc(String term_desc) {
        this.term_desc = term_desc;
    }

    public Timestamp getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(Timestamp last_modified_date) {
        this.last_modified_date = last_modified_date;
    }
}
