package in.ankit.correspondence.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String fullName;
	private String userEmail;
	private String userPwd;
	private Long userPhno;
	private String userGender;
	private String UserDob;
	private String userSSN;
	private String active_Switch;
	private String accStatus;
	private String userRole;
	
	@CreationTimestamp
	private LocalDate createDate;
	
	@UpdateTimestamp
	private LocalDate updateDate;
	
	@ManyToOne
    @JoinColumn(name = "admin_id")
	private UserEntity createdBy;
	
	@ManyToOne
    @JoinColumn(name = "admi_id")
	private UserEntity updatedBy;
 }

