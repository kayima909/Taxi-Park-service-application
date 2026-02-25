package com.example.taxiparking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taxiPark")
public class TaxiPackController {


    private final TaxiParkService taxiParkService;
    public TaxiPackController(TaxiParkService taxiParkService) {
        this.taxiParkService = taxiParkService;
    }
    @PostMapping
    public ResponseEntity<TaxiPark> createTaxiPark(@RequestBody TaxiPark taxiPark){
        TaxiPark saved =  taxiParkService.createTaxiPark(taxiPark);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
        //we shall begin from here
    }
    @GetMapping("/{Id}")
    public ResponseEntity<TaxiPark> getTaxiPark(@PathVariable("Id") Long id){
        TaxiPark taxiPark = taxiParkService.getTaxiParkById(id);
       return ResponseEntity.ok(taxiPark);
    }
    @PutMapping("/{Id}")
    public ResponseEntity<TaxiPark> updateTaxiPark(@PathVariable("Id") Long Id, @RequestBody TaxiPark taxiPark){
        TaxiPark updated = taxiParkService.updateTaxiPark(Id, taxiPark);
        return ResponseEntity.ok(updated);

    }
    @DeleteMapping("/{Id}")
    public ResponseEntity<Void> deleteTaxiPark(@PathVariable("Id") Long id){
        taxiParkService.deleteTaxiPark(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity <List<TaxiPark>> getAllTaxiParks(){
    List<TaxiPark> taxiParks= taxiParkService.getAllTaxiParks();
    return ResponseEntity.ok(taxiParks);
    }
}
