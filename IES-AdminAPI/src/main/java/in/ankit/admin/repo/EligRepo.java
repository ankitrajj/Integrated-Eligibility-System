package in.ankit.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ankit.admin.entity.EligEntity;

@Repository
public interface EligRepo extends JpaRepository<EligEntity, Integer> {

}
