package org.app.digital_banking.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double amount;

    @Enumerated(EnumType.STRING)
    private OperationType type;

    @ManyToOne
    private BankAcount bankAcount;

}
