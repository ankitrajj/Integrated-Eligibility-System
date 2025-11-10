package in.ankit.eligdet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ankit.eligdet.entities.EligEntity;


@Repository
public interface EligRepo extends JpaRepository<EligEntity, Integer> {

}
