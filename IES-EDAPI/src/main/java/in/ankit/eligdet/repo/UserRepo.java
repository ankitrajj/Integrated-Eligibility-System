package in.ankit.eligdet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ankit.eligdet.entities.UserEntity;


@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
   
	@Query("update UserEntity set accStatus=:status where userId=:userId")
	public Integer updateAccStatus(Integer userId, String status);
	
	public UserEntity findByUserEmail(String email);
	
	public UserEntity findByUserEmailAndUserPwd(String email, String password);
	
}
