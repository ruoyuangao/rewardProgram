package com.example.rewardprogram.service;

import com.example.rewardprogram.pojo.RecordRequestDTO;
import com.example.rewardprogram.pojo.RewardResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface RewardProgramService {
    void createRecords(RecordRequestDTO recordRequestDTO);

    RewardResponseDTO getRewardById(String id);
}
