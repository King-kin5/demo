package com.demo.demo.Repository;

import com.demo.demo.Model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository  extends JpaRepository<Apartment,Integer> {
}
