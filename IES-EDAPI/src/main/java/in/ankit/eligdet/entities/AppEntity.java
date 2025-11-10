package in.ankit.eligdet.entities;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AppEntity {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long caseNum;
	private String fullname;
	private String email;
	private String gender;
	private LocalDate dob;
	private String phno;
	private Long ssn;

	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "income_id") 
    private IncomeEntity income;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "education_id") 
    private EducationEntity education;

    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
    private List<KidEntity> kid;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
	
	
}
