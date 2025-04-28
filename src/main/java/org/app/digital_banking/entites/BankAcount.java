package org.app.digital_banking.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public abstract class BankAcount {
 @Id
    private int id;
    private Date createAt;
    private double balance;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private String currency;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy =  "bankAccount")
    private List<Operation> operations;

}
