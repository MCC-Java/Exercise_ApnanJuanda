/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Country;
import tools.Koneksi;

/**
 *
 * @author ASUS
 */
public class CountryDAO {
    
    //karena DAO sangat erat kaitannya dengan Database maka di constructornya harus kita setel dulu koneksinya
    private  Connection connection = null;
    public CountryDAO(){
        this.connection = new Koneksi().getConnection();   
    }
    
    
    
    
    public List<Country> getAllCountry(){
        List<Country> countries = new ArrayList<>();
        String strSelect = "SELECT * FROM country;";
        try {
            
            PreparedStatement statement = connection.prepareStatement(strSelect);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Country country = new Country(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4));
                countries.add(country);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return countries;
    }
    
    public List<Country> getStayData(){
        List<Country> countries = new ArrayList<>();
        String strSelect = "SELECT data_id FROM country;";
        try {
            
            PreparedStatement statement = connection.prepareStatement(strSelect);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Country country = new Country(resultSet.getInt(1));
                countries.add(country);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return countries;
    }
    
    public boolean insert(Country country){
        boolean result = false;
        String strCheck = "SELECT * FROM country WHERE id=? || name=?;";
        try {
            PreparedStatement statement = connection.prepareStatement(strCheck);
            statement.setString(1, country.getId());
            statement.setString(2, country.getName());
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                result=false;  
            }
            
            else {
            String strInsert = "INSERT INTO country(id,name,region) VALUES (?,?,?);";
            PreparedStatement statement2 = connection.prepareStatement(strInsert);
            statement2.setString(1, country.getId());
            statement2.setString(2, country.getName());
            statement2.setInt(3, country.getRegion());
            statement2.executeUpdate();
            result = true;
            }
           
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
          }
      return result;
    }
    
    
    
    public boolean update(Country country){
        boolean result = false;
        String strUpdate = "UPDATE country SET id=?, name=?, region=? WHERE data_id=?";
        
        try {
            
            PreparedStatement statement = connection.prepareStatement(strUpdate);
            statement.setString(1, country.getId());
            statement.setString(2, country.getName());
            statement.setInt(3, country.getRegion());
            statement.setInt(4, country.getData_id());
            statement.execute();
            result = true;
            
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
      return result;
    }
    
    public List<Country> getAllByName(String name){
        List<Country> countries = new ArrayList<>();
        String strSearch = "SELECT * FROM country WHERE name LIKE ?;";
        try {
            
            PreparedStatement statement = connection.prepareStatement(strSearch);
            statement.setString (1, "%" + name + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Country country = new Country(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4));
                countries.add(country);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      return countries;
    }
    
    //ini untuk delete mirip seperti update
     public boolean delete(Country country){
        boolean result = false;
        String strDelete = "DELETE FROM country WHERE data_id=?";
        
        try {
            
            PreparedStatement statement = connection.prepareStatement(strDelete);
            statement.setInt(1, country.getData_id());
            statement.execute();
            result = true;
            
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
      return result;
    }

       
}
