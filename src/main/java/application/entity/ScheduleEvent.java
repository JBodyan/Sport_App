package application.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ScheduleEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    //название занятия
    String name;
    //описание тренировки
    @Column(columnDefinition = "text")
    String description;
    public ScheduleEvent(int id){
        this.id=id;
    }
    public ScheduleEvent(){

    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
