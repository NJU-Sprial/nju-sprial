package vo;

import lombok.Data;

/**
 * Created by LENOVO on 2017/9/3.
 */
@Data
public class PartnerVO {
    String name;  //协作方姓名
    String gender;  //协作方性别
    String workUnit;    //协作方工作单位
    String position;    //协作方职位

    public PartnerVO(String name, String gender, String workUnit, String position) {
        this.name = name;
        this.gender = gender;
        this.workUnit = workUnit;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public String getPosition() {
        return position;
    }
}
