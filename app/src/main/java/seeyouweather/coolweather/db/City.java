package seeyouweather.coolweather.db;

import org.litepal.crud.DataSupport;

/************存放省的数据对应的实体类***********/
public class City extends DataSupport {

    private int id;           //记录市的id
    private String cityName;  //记录市的名称
    private int cityCode;     //记录市的代号
    private int provinceId;   //记录省的id

    //获取市的id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //获取市的名称
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    //获取市的代号
    public int getCityCode(){ return cityCode; }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    //获取省的id
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
