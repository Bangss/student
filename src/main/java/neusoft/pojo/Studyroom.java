package neusoft.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Studyroom {
    private Integer Rid;
    private String Rname;
    private Integer IsEmpty;
    private String UseBySid;
    private String SignUpTid;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date ApplyTime;
    private Integer ReturnTime;

    public Studyroom(){
    }

    public Studyroom(Integer rid, String rname, Integer isEmpty, String useBySid, String signUpTid, Date applyTime, Integer returnTime) {
        Rid = rid;
        Rname = rname;
        IsEmpty = isEmpty;
        UseBySid = useBySid;
        SignUpTid = signUpTid;
        ApplyTime = applyTime;
        ReturnTime = returnTime;
    }

    public int getRid() {
        return Rid;
    }

    public void setRid(Integer rid) {
        Rid = rid;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String rname) {
        Rname = rname;
    }

    public int getIsEmpty() {
        return IsEmpty;
    }

    public String getUseBySid() {
        return UseBySid;
    }

    public void setUseBySid(String useBySid) {
        UseBySid = useBySid;
    }

    public String getSignUpTid() {
        return SignUpTid;
    }

    public void setSignUpTid(String signUpTid) {
        SignUpTid = signUpTid;
    }

    public Date getApplyTime() {
        return ApplyTime;
    }

    public void setApplyTime(Date applyTime) {
        ApplyTime = applyTime;
    }

    public Integer getReturnTime() {
        return ReturnTime;
    }

    public void setReturnTime(Integer returnTime) {
        ReturnTime = returnTime;
    }

    @Override
    public String toString() {
        return "Studyroom{" +
                "Rid=" + Rid +
                ", Rname='" + Rname + '\'' +
                ", IsEmpty=" + IsEmpty +
                ", UseBySid='" + UseBySid + '\'' +
                ", SignUpTid='" + SignUpTid + '\'' +
                ", ApplyTime=" + ApplyTime +
                ", ReturnTime=" + ReturnTime +
                '}';
    }
}
