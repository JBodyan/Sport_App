package application.api;

import application.entity.ScheduleEvent;
import application.helper.JSONResult;
import application.helper.JSONResultError;
import application.helper.JSONResultOk;
import application.service.implementations.SchedulesEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/1.0/events")
public class ScheduleEventController {

    @Autowired
    SchedulesEventService eventService;

    @GetMapping()
    public JSONResult<List<ScheduleEvent>> getSchedulesEvent() {
        List<ScheduleEvent> events = new ArrayList<>();
        try {
            events = eventService.getAll();
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<List<ScheduleEvent>>(events, ex.getMessage());
        }
        return new JSONResultOk<>(events);
    }

    @PostMapping()
    public JSONResult<ScheduleEvent> addContact(@RequestBody ScheduleEvent event) {
        ScheduleEvent newEvent = new ScheduleEvent();
        try {
            newEvent.setName(event.getName());
            newEvent.setDescription(event.getDescription());
            newEvent = eventService.save(newEvent);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<ScheduleEvent>(newEvent, ex.getMessage());
        }
        return new JSONResultOk<ScheduleEvent>(newEvent);
    }

    @DeleteMapping("/{id}")
    public JSONResult<ScheduleEvent> deleteContact(@PathVariable int id) {
        ScheduleEvent event = new ScheduleEvent();
        try {
            event = eventService.getById(id);
            eventService.delete(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new JSONResultError<>(event, ex.getMessage());
        }
        return new JSONResultOk<>(new ScheduleEvent());
    }
}