package com.niit.miniprojectmongodb.service;

import com.niit.miniprojectmongodb.model.Furniture;

import java.util.List;

public interface FurnitureService {
    Furniture saveFurniture(Furniture furniture);
    List<Furniture> getAllFurniture();
    boolean deleteFurniture(int idNo);
}
