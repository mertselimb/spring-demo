package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl: No arg init");
    }

    public SpeakerServiceImpl(SpeakerRepository repository ) {
        System.out.println("SpeakerServiceImpl: Arg init");
        this.repository = repository;
    }

    @PostConstruct
    private void  initilize(){
        System.out.println("SpeakerServiceImpl: We're called after the constructors.");
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
