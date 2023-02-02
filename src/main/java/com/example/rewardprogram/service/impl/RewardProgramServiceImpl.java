package com.example.rewardprogram.service.impl;

import com.example.rewardprogram.pojo.Record;
import com.example.rewardprogram.pojo.RecordRequestDTO;
import com.example.rewardprogram.pojo.Reward;
import com.example.rewardprogram.pojo.RewardResponseDTO;
import com.example.rewardprogram.repository.RecordRepository;
import com.example.rewardprogram.repository.RewardRepository;
import com.example.rewardprogram.service.RewardProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class RewardProgramServiceImpl implements RewardProgramService {

    private final RecordRepository recordRepository;

    private final RewardRepository rewardRepository;

    @Autowired
    public RewardProgramServiceImpl (RecordRepository recordRepository, RewardRepository rewardRepository) {
        this.recordRepository = recordRepository;
        this.rewardRepository = rewardRepository;
    }

    @Override
    @Transactional
    public void createRecords(RecordRequestDTO recordRequestDTO) {
        for (Record record : recordRequestDTO.getRecordList()) {
            double spend = record.getMoeny_spend();
            double point = spend > 100 ? 2 * (spend - 100) + 50 : 0;
            point = (spend > 50 && spend < 100) ? (spend - 50) : 0;
            record.setPoints_received(point);
            this.recordRepository.save(record);
        }
    }

    @Override
    public RewardResponseDTO getRewardById(String id) {
        List<Reward> rewardList = this.rewardRepository.getRewardByCusId(id);
        return new RewardResponseDTO(rewardList);
    }
}
