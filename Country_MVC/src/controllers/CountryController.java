/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CountryDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Country;
import views.FormCountry;

/**
 *
 * @author ASUS
 */
public class CountryController {
    
    //karena Controller sering menghubungkan dengan DAO maka di contructornya kita harus nulis hubungan mereka
    private CountryDAO cdao;
    private FormCountry formCountry;
    List<Country> countries;

    public CountryController(FormCountry formCountry) {
        this.formCountry = formCountry;
        cdao = new CountryDAO();
    }

    public List<Country> binding(){
        List<Country> countries = new ArrayList<>();
        countries = cdao.getAllCountry();
        return countries;
    }
    
    public List<Country> staying(){
        List<Country> countries = new ArrayList<>();
        countries = cdao.getStayData();
        return countries;
    }
    
    
    
    public String inserting(String id, String name, String region){
        String result = "Simpan data gagal";
        int nregion = Integer.parseInt(region);
        Country country = new Country(id, name, nregion);
        if(cdao.insert(country)) result = "Simpan data berhasil";
        else {
            result = "Terdapat duplikat data";
        }
        
        return result;
    }
   
    
    public String updating(String id, String name, String region, String data_id){
        String result = "Update data gagal";
        int nregion = Integer.parseInt(region);
        int ndataid = Integer.parseInt(data_id);
        Country country = new Country(id, name, nregion, ndataid);
        if(cdao.update(country)) result = "Update data berhasil";
        
        return result;
    }
    
    public List<Country> searching(String name){
        List<Country> countries = new ArrayList<>();
        countries = cdao.getAllByName(name);
        return countries;
    }
    
    public String deleting(int data_id){
        String result = "Hapus data gagal";
        Country country = new Country(data_id);
        if(cdao.delete(country)) result = "Hapus data berhasil";
     
        return result;
    }
    
    public void reset(){
        formCountry.gettxtid().setText("");
        formCountry.gettxtname().setText("");
        formCountry.gettxtregion().setText("");
        formCountry.gettxtdataid().setText("");
    }
    
    
}
