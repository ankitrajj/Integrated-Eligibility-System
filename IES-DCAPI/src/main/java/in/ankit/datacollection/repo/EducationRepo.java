package in.ankit.datacollection.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.datacollection.entities.EducationEntity;

public interface EducationRepo extends JpaRepository<EducationEntity, Integer> {

}
