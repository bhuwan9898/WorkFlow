package com.learnerscorner.workflow;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Worker {
    @Id //for primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //for auto generated id
    private Integer id;
    private String username;
    @JsonIgnore
    private String password;

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
