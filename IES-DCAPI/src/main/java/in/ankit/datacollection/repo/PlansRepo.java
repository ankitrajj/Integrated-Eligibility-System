package in.ankit.datacollection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ankit.datacollection.entities.PlansEntity;


@Repository
public interface PlansRepo extends JpaRepository<PlansEntity, Integer> {
	
	@Query("update PlansEntity set active_switch=:status where planId=:planId")
	public Integer updatePlanStatus(Integer planId, String status);

}
