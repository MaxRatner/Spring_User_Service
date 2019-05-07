package org.test.userservice;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource (collectionResourceRel = "profiles", path = "profiles")
public interface RestRepository extends CrudRepository<Profile, Long> {
    List<Profile> findByEmail(@Param("email") String email);
}