package in.ankit.eligdet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ankit.eligdet.entities.RolesEntity;


@Repository
public interface RoleRepo extends JpaRepository<RolesEntity, Integer> {

}
