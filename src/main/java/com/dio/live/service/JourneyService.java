package com.dio.live.service;

import com.dio.live.model.WorkJourney;
import com.dio.live.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    private final JourneyRepository journeyRepository;

    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public WorkJourney saveJourney(WorkJourney workJourney){
       return journeyRepository.save(workJourney);

    }

    public List<WorkJourney> findAll() {
       return   journeyRepository.findAll();
    }

    public Optional<WorkJourney> getById(Long journeyId) {
        return journeyRepository.findById(journeyId);
    }

    public WorkJourney updateJourney(WorkJourney workJourney){
        return journeyRepository.save(workJourney);

    }

    public void deleteJourney(Long journeyId) {
        journeyRepository.deleteById(journeyId);
    }
}
