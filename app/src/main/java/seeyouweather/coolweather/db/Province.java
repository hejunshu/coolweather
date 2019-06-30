package seeyouweather.coolweather.db;

import org.litepal.crud.DataSupport;

/************存放省的数据对应的实体类***********/
public class Province extends DataSupport {
    private int id;               //记录省的id
    private String provinceName;  //记录省的名称
    private int provinceCode;     //记录省的代号

    //获取省的id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
   //获取省的名称
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    //获取省的代号
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
