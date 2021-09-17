package com.dio.live.controller;

import com.dio.live.model.WorkJourney;
import com.dio.live.service.JourneyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journey")
public class WorkJourneyController {

    private final JourneyService journeyService;

    public WorkJourneyController(JourneyService journeyService) {
        this.journeyService = journeyService;
    }

    @PostMapping
    public WorkJourney createJourney(@RequestBody WorkJourney workJourney){
        return journeyService.saveJourney(workJourney);
    }

    @GetMapping
    public List<WorkJourney> getJourneyList(){
        return journeyService.findAll();

    }

    @GetMapping("/{journeyId}")
    public ResponseEntity<WorkJourney> getJourneyByID(@PathVariable("journeyId") Long journeyId) {
        return  ResponseEntity.ok(journeyService.getById(journeyId).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public WorkJourney updateJourney(@RequestBody WorkJourney workJourney){
        return journeyService.updateJourney(workJourney);
    }

    @DeleteMapping("/{journeyId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<WorkJourney> deleteByID(@PathVariable("journeyId") Long journeyId) {
       try {
           journeyService.deleteJourney(journeyId);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return (ResponseEntity<WorkJourney>) ResponseEntity.ok();

    }



}
