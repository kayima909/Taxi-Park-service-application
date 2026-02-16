package com.example.taxiparking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taxiPark")
public class TaxiPackController {

    @Autowired
    private TaxiParkService taxiParkService;
    @PostMapping("/{Id}")
    public void createTaxiPark(@RequestBody TaxiPark taxiPark){
        taxiParkService.createTaxiPark(taxiPark);
    }
    @GetMapping("/{Id}")
    public TaxiPark getTaxiPark(@PathVariable("Id") Long id){
       return taxiParkService.getTaxiParkById(id);
    }
    @PutMapping("/{Id}")
    public void updateTaxiPark(@PathVariable("Id") Long Id, @RequestBody TaxiPark taxiPark){
        taxiPark.setId(Id);
        taxiParkService.updateTaxiPark(taxiPark);

    }
    @DeleteMapping("/{Id}")
    public void deleteTaxiPark(@PathVariable("Id") Long id){
        taxiParkService.deleteTaxiPark(id);
    }
    @GetMapping
    public List<TaxiPark> getAllTaxiParks(){
    return taxiParkService.getAllTaxiParks();
    }
}
