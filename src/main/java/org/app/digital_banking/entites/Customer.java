package org.app.digital_banking.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

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

    @OneToMany(mappedBy = "customer")
    private List<BankAcount> bankAccounts;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
