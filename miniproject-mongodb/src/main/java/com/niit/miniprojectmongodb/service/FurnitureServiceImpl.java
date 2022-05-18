package com.niit.miniprojectmongodb.service;

import com.niit.miniprojectmongodb.model.Furniture;
import com.niit.miniprojectmongodb.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureServiceImpl implements FurnitureService{
    private FurnitureRepository furnitureRepository;

    @Autowired
    public FurnitureServiceImpl(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    @Override
    public Furniture saveFurniture(Furniture furniture) {
        return furnitureRepository.save(furniture);
    }

    @Override
    public List<Furniture> getAllFurniture() {
        return furnitureRepository.findAll();
    }

    @Override
    public boolean deleteFurniture(int idNo) {
        furnitureRepository.deleteById(idNo);
        System.out.println("hi");
        return true;
    }
}
