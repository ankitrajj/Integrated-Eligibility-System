package in.ankit.eligdet.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IES_PLANS")
@Getter
@Setter
public class PlansEntity {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer planId;
	private String planName;
	
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	
	private String Plan_Category;
	private String active_switch;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity createdBy;
	
	@ManyToOne
	@JoinColumn(name = "use_id")
	private UserEntity updatedBy;
	
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	
}
