package com.example.agendalive.service;

import com.example.agendalive.model.Live;
import com.example.agendalive.repository.LiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiveService {

    @Autowired
    LiveRepository liveRepository;

    public Live save(Live liveDocument){
        return liveRepository.save(liveDocument);
    }
}

