/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ASUS
 */
public class Country {
    private String id, name;
    private int region, data_id;
    
    public Country(){
        
    }
    
    public Country(String id, String name, int region){
        this.id = id;
        this.name = name;
        this.region = region; 
    }
    
     public Country(String id, String name, int region, int data_id){
        this.id = id;
        this.name = name;
        this.region = region; 
        this.data_id = data_id;
    }

    public Country(int data_id) {
        this.data_id = data_id;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the region
     */
    public int getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(int region) {
        this.region = region;
    }

    /**
     * @return the data_id
     */
    public int getData_id() {
        return data_id;
    }

    /**
     * @param data_id the data_id to set
     */
    public void setData_id(int data_id) {
        this.data_id = data_id;
    }
    
    
    
}
