package com.example.taxiparking;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiParkService {
    private final  TaxiParkRepository taxiParkRepository;

    public TaxiParkService(TaxiParkRepository taxiParkRepository) {
        this.taxiParkRepository = taxiParkRepository;
    }
    public void createTaxiPark(TaxiPark taxiPark){
        taxiParkRepository.save(taxiPark);
    }
    public void deleteTaxiPark(Long id){
        taxiParkRepository.deleteById(id);
    }
    public TaxiPark getTaxiParkById(Long id){
        return taxiParkRepository.findById(id).orElse(null);
    }
    public void updateTaxiPark(TaxiPark updatedTaxiPark){
        TaxiPark initialTaxiPark = taxiParkRepository.findById(updatedTaxiPark.getId()).orElse(null);
    }
    public List<TaxiPark> getAllTaxiParks(){
        return taxiParkRepository.findAll();
    }
}
