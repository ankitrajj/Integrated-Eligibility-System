package in.ankit.eligdet.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EligEntity {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer traceId;
	private Long caseNum;
	private String planName;
	private String planStatus;
	private LocalDate eligStartDate;
	private LocalDate eligEndDate;
	private Double benefitAmt;
	private String denialRsn;
	
	
}
