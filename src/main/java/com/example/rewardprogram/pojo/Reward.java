package com.example.rewardprogram.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reward {
    private String customer_id;

    private String customer_name;

    private int months;

    private double ttl_points;
}
