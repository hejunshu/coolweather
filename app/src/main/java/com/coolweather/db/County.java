package com.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;               //记录县的id
    private String countyName;    //记录县的名称
    private String weatherId;     //记录县的天气
    private int cityId;           //记录市的id

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(){
        this.weatherId = weatherId;
    }
}
