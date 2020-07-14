/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.crud.controllers;

import com.mcc.crud.entities.Region;
import com.mcc.crud.services.RegionService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ASUS
 */
@Controller
public class RegionController {
    
    
    @Autowired
    private RegionService regionService;
    
    @GetMapping("/")
    public String index(Model model, 
            @Param("keyword") String keyword){
        model.addAttribute("region", new Region());
        model.addAttribute("regions", regionService.getAll(keyword));
        //model.addAttribute("keyword",keyword);
        model.addAttribute("keyword", keyword);
        return "index";
    }
    
    @PostMapping("/save")
    public String save(@Valid Region region){
        regionService.save(region);
        return "redirect:/";
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteRegion(@PathVariable(name = "id") int id){
        regionService.delete(id);
        return "redirect:/";   
    }
    
//    @RequestMapping("/select/{id}")
//    public List<Region> getById(@PathVariable (name = "id") int id){
//        return regionService.getAllById(id);        
//    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showDetailRegion(@PathVariable(name ="id") int id){
        ModelAndView mav = new ModelAndView("detail_region");
        
        Region region = regionService.get(id);
        mav.addObject("region", region);
        return mav;
    }
    

    
    
    
    
    
    
}
