package com.shixun.springboot.model;

import java.util.Date;

public class Art {
    private String ResultName;//所属单位
    private String Unit;//成果名称
    private Date StartTime;//发表时间
    private String PublicationName;//刊物、比赛、展览名称
    private boolean IfAward;//是否获奖
    private String ResultType;//成果类型
    private String School;//学校署名

    public String getResultName() {
        return ResultName;
    }

    public void setResultName(String resultName) {
        ResultName = resultName;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public String getPublicationName() {
        return PublicationName;
    }

    public void setPublicationName(String publicationName) {
        PublicationName = publicationName;
    }

    public boolean isIfAward() {
        return IfAward;
    }

    public void setIfAward(boolean ifAward) {
        IfAward = ifAward;
    }

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String resultType) {
        ResultType = resultType;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    @Override
    public String toString() {
        return "Art{" +
                "ResultName='" + ResultName + '\'' +
                ", Unit='" + Unit + '\'' +
                ", StartTime=" + StartTime +
                ", PublicationName='" + PublicationName + '\'' +
                ", IfAward=" + IfAward +
                ", ResultType='" + ResultType + '\'' +
                ", School='" + School + '\'' +
                '}';
    }

}
