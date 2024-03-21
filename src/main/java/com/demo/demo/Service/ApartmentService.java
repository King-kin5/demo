package com.demo.demo.Service;

import com.demo.demo.Model.Apartment;
import com.demo.demo.Repository.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    public Apartment registerApartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    public List<Apartment> getAllApartments() {
        return apartmentRepository.findAll();
    }
}
