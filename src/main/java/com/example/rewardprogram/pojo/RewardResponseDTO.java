package com.example.rewardprogram.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RewardResponseDTO {
    private List<Reward> rewardList;

    private Double threemonth_ttl_reward;

    public RewardResponseDTO(List<Reward> rewardList) {
        this.rewardList = rewardList;

        for (Reward r : rewardList) {
            this.threemonth_ttl_reward += r.getTtl_points();
        }
    }
}
