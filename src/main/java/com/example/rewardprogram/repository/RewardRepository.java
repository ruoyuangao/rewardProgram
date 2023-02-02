package com.example.rewardprogram.repository;

import com.example.rewardprogram.pojo.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {

    @Query(value="select r.cus.id, r.cus.name, DATE_FORMAT(r.record_created,'%Y%m') as months, sum(r.points_received) as ttl_points from Record r where r.cus.id = :id group by months")
    List<Reward> getRewardByCusId(String id);
}
