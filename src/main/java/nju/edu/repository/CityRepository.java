package nju.edu.repository;

import nju.edu.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRepository extends CrudRepository<City, String> {
    City findCityByCityId(String cityId);
}
