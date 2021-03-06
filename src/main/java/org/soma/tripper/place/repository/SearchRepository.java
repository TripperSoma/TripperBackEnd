package org.soma.tripper.place.repository;

import org.soma.tripper.place.entity.Search;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<Search,Integer> {
    Search findByCityOrCountry(String city,String country);
    boolean existsByCityOrCountry(String city, String country);
}
