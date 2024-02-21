package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sports;
import com.example.demo.repository.SportsRepo;

@Service
public class SportsService {
    @Autowired
    SportsRepo sr;

    @SuppressWarnings("null")
    public Sports create(Sports s) {
        return sr.save(s);
    }

    public Sports getById(int i) {
        return sr.findById(i).orElse(null);
    }
    public void delete (int id)
    {
         sr.deleteById(id);
    }
   public Sports updateSports(int id,Sports sports)
   {
    Sports s=sr.findById(id).orElse(null);
    if(s!=null)
    {
        s.setId(sports.getId());
        s.setProductId(sports.getProductId());
        s.setPrice(sports.getPrice());
    }
    return sr.save(s);
      
   }

   
}