package in.ankit.eligdet.entities;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "IES_USER")
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
	
	@ManyToOne()
	@JoinColumn(name = "role_id")
	private RolesEntity roleId;
	
	@OneToMany(mappedBy = "planId", cascade = CascadeType.ALL)
	private List<PlansEntity> plans;
	
 }

