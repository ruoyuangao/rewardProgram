package com.example.rewardprogram.controller;

import com.example.rewardprogram.RewardProgramApplication;
import com.example.rewardprogram.pojo.*;
import com.example.rewardprogram.service.RewardProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RewardProgramController {

    private final RewardProgramService service;

    @Autowired
    public RewardProgramController (RewardProgramService service) {
        this.service = service;
    }

    @PostMapping("/records")
    public ResponseEntity<Void> createRecords(@RequestBody RecordRequestDTO recordRequestDTO) {
        this.service.createRecords(recordRequestDTO);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }

    @PostMapping("/records")
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer) {
        this.service.createCustomer(customer);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }

    @GetMapping("/rewards/{id}")
    public ResponseEntity<RewardResponseDTO> getRewardInfoById(@PathVariable String id) {
        RewardResponseDTO rewardResponseDTO = this.service.getRewardById(id);
        return new ResponseEntity<>(rewardResponseDTO, HttpStatus.OK);
    }
}
