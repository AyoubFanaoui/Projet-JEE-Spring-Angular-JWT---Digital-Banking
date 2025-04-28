package org.app.digital_banking.entites;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
