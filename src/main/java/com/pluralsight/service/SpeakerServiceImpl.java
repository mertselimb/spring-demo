package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("No arg init");
    }

    public SpeakerServiceImpl(SpeakerRepository repository ) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
