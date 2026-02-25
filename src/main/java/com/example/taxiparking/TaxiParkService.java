package com.example.taxiparking;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiParkService {
    private final  TaxiParkRepository taxiParkRepository;

    public TaxiParkService(TaxiParkRepository taxiParkRepository)
    {
        this.taxiParkRepository = taxiParkRepository;
    }
    public TaxiPark createTaxiPark(TaxiPark taxiPark){
        return taxiParkRepository.save(taxiPark);
    }
    public void deleteTaxiPark(Long id){
        if (!taxiParkRepository.existsById(id)){
            throw new RuntimeException("TaxiPark not found with id:  "+ id );
        }
        taxiParkRepository.deleteById(id);
    }
    public TaxiPark getTaxiParkById(Long id){
        return taxiParkRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TaxiPark not found with id:  "+ id ));
    }
    public TaxiPark updateTaxiPark(Long id, TaxiPark updatedTaxiPark){
        TaxiPark existing = taxiParkRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TaxiPark not found with id: " + id ));
        existing.setCarType(updatedTaxiPark.getCarType());
        existing.setRouteNumbers(updatedTaxiPark.getRouteNumbers());
        existing.setDayOfTheWeek(updatedTaxiPark.getDayOfTheWeek());
        existing.setStartTime(updatedTaxiPark.getStartTime());
        existing.setEndTime(updatedTaxiPark.getEndTime());
        return taxiParkRepository.save(existing);

    }
    public List<TaxiPark> getAllTaxiParks(){
        return taxiParkRepository.findAll();
    }
}
