package lingnan.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Studyroom {
    private Integer roomId;
    private String roomName;
    private Integer isEmpty;
    private Integer useBySid;
    private Integer signUpTid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date applyTime;
    private Integer returnTime;

    public Studyroom(){
    }

    public Studyroom( Integer roomId, String roomName, Integer isEmpty, Integer useBySid, Integer signUpTid, Date applyTime, Integer returnTime) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.isEmpty = isEmpty;
        this.useBySid = useBySid;
        this.signUpTid = signUpTid;
        this.applyTime = applyTime;
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "Studyroom{" +
                "rid=" + roomId +
                ", rname='" + roomName + '\'' +
                ", isEmpty=" + isEmpty +
                ", useBySid='" + useBySid + '\'' +
                ", signUpTid='" + signUpTid + '\'' +
                ", applyTime=" + applyTime +
                ", returnTime=" + returnTime +
                '}';
    }

    public Integer getRoomId () {
        return roomId;
    }

    public void setRoomId ( Integer roomId ) {
        this.roomId = roomId;
    }

    public String getRoomName () {
        return roomName;
    }

    public void setRoomName ( String roomName ) {
        this.roomName = roomName;
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
