package in.ankit.benefit.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class BenefitIssuance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String benefitType;
    private Double amount;
    private LocalDate issueDate;
    private String status; // e.g., ISSUED, PENDING, CANCELLED
}
