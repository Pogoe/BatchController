/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author jacqueskwizera
 */
public interface iBatchController {
    public double getTemp1();
    public double getTemp2();
    public double getMoist();
    public double getWaterLevel();
    public void setTemp(int kelvin);
    public void setMoist(int moist);
    public void addWater(int sec);   
}
