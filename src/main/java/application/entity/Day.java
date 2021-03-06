package application.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int attribute;

    String nameDay;

    public int getId() {
        return id;
    }

    public String getNameDay() { return nameDay; }

    public int getAttribute() {
        return attribute;
    }

    public Day(){
    }
}
