package com.example.agendalive.controller;

import com.example.agendalive.model.Live;
import com.example.agendalive.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LiveController {

    @Autowired
    LiveService liveService;

    @PostMapping("/lives")
    public ResponseEntity<Live> saveLive(@RequestBody Live live) {
        return new ResponseEntity<Live>(liveService.save(live), HttpStatus.CREATED);
    }
}
