package application.service.implementations;

import application.entity.Schedule;
import application.entity.ScheduleEvent;
import application.repository.ScheduleRepository;
import application.service.interfaces.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ScheduleService implements EntityService<Schedule> {
    @Autowired
    ScheduleRepository repository;
    @Override
    public List<Schedule> getAll() { return repository.findAll(); }

    @Override
    public Schedule getById(int id) {
       return repository.findById(id).get();
    }

    @Override
    public void save(Schedule schedule) {
         repository.save(schedule);
    }

    @Override
    public void delete(int id)  { repository.deleteById(id); }
}