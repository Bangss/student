package lingnan.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Studyroom {
    private Integer rid;
    private String rname;
    private Integer isEmpty;
    private Integer useBySid;
    private Integer signUpTid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTime;
    private Integer returnTime;

    public Studyroom(){
    }

    public Studyroom(Integer rid, String rname, Integer isEmpty, Integer useBySid, Integer signUpTid, Date applyTime, Integer returnTime) {
        this.rid = rid;
        this.rname = rname;
        this.isEmpty = isEmpty;
        this.useBySid = useBySid;
        this.signUpTid = signUpTid;
        this.applyTime = applyTime;
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "Studyroom{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", isEmpty=" + isEmpty +
                ", useBySid='" + useBySid + '\'' +
                ", signUpTid='" + signUpTid + '\'' +
                ", applyTime=" + applyTime +
                ", returnTime=" + returnTime +
                '}';
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(Integer isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Integer getUseBySid() {
        return useBySid;
    }

    public void setUseBySid(Integer useBySid) {
        this.useBySid = useBySid;
    }

    public Integer getSignUpTid() {
        return signUpTid;
    }

    public void setSignUpTid(Integer signUpTid) {
        this.signUpTid = signUpTid;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Integer returnTime) {
        this.returnTime = returnTime;
    }
}
