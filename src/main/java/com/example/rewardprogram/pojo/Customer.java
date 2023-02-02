package com.example.rewardprogram.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private String id;

    @Column(name = "customer_name")
    private String name;

    @OneToMany(mappedBy = "cus", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = false)
    @JsonIgnore
    private List<Record> recordList;
}
