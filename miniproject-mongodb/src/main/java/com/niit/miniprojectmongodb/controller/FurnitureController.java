package com.niit.miniprojectmongodb.controller;

import com.niit.miniprojectmongodb.model.Furniture;
import com.niit.miniprojectmongodb.service.FurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins ="*")
public class FurnitureController {
    private FurnitureService furnitureService;

    @Autowired
    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addFurniture(@RequestBody Furniture furniture){
        return new ResponseEntity<>(furnitureService.saveFurniture(furniture), HttpStatus.CREATED);
    }

    @GetMapping("/getFurniture")
    public ResponseEntity<?> getFurniture()
    {
        return new ResponseEntity<>(furnitureService.getAllFurniture(),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idNo}")
    public ResponseEntity<?> deleteFurniture(@PathVariable("idNo") int idNo) {
        return new ResponseEntity<>(furnitureService.deleteFurniture(idNo), HttpStatus.OK);
    }
}
