package application.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    //день недели
   private int dayofweek;
    //время начала занятия
    @Column(columnDefinition ="time")
   private Date starttime;
    //вторичный ключ schedule_event
 //   @ManyToOne(targetEntity = ScheduleEvent.class)
    @ManyToOne(targetEntity = ScheduleEvent.class,fetch = FetchType.EAGER,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name="event_schedule")
    private  List<ScheduleEvent> eventsList=new ArrayList<>();
    //int idSeduleEvent;
}
