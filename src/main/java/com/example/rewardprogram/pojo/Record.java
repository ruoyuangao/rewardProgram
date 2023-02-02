package com.example.rewardprogram.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.sql.Time;
import java.text.SimpleDateFormat;

@Entity
@Table(name="customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record {
    @Id
    @GeneratedValue
    private String record_id;

    @Column(name = "customer_id")
    private String customer_id;

    @Column(name = "moeny_spend")
    private double moeny_spend;

    @Column(name = "points_received", nullable = true)
    private double points_received;

    @Column(name = "record_created")
    private SimpleDateFormat record_created;
}
