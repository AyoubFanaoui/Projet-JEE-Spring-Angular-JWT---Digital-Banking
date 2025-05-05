package org.app.digital_banking.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", length = 4)
public abstract class BankAcount {
 @Id
    private int id;
    private Date createAt;
    private double balance;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private String currency;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy =  "bankAccount")
    private List<Operation> operations;

}
