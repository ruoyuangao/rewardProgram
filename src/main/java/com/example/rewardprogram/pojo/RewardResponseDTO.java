package com.example.rewardprogram.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class RewardResponseDTO {
    private String customer_id;

    private String customer_name;

    private Map<Integer, Double> monthly_reward;

    private Double three_month_ttl_reward;

    public RewardResponseDTO(List<Reward> rewardList) {
        this.customer_id = rewardList.get(0).getCustomer_id();

        this.customer_name = rewardList.get(0).getCustomer_name();

        for (Reward reward : rewardList) {
            this.monthly_reward.put(reward.getMonths(), reward.getTtl_points());
            this.three_month_ttl_reward += reward.getTtl_points();
        }

    }
}
