package neusoft.pojo;

import java.util.Date;

public class Student {
    private Integer stuId;
    private String stuName;
    private String gender;
    private Integer age;
    private Integer depId;
    private String email;
    private String regTime;
    private String lastLogTime;

    public Student ( ) {
    }

    public Student ( Integer stuId, String stuName, String gender, Integer age, Integer depId, String email, String  regTime, String  lastLogTime ) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
        this.age = age;
        this.depId = depId;
        this.email = email;
        this.regTime = regTime;
        this.lastLogTime = lastLogTime;
    }

    public Integer getStuId ( ) {
        return stuId;
    }

    public void setStuId ( Integer stuId ) {
        this.stuId = stuId;
    }

    public String getStuName ( ) {
        return stuName;
    }

    public void setStuName ( String stuName ) {
        this.stuName = stuName;
    }

    public String getGender ( ) {
        return gender;
    }

    public void setGender ( String gender ) {
        this.gender = gender;
    }

    public Integer getAge ( ) {
        return age;
    }

    public void setAge ( Integer age ) {
        this.age = age;
    }

    public Integer getDepId ( ) {
        return depId;
    }

    public void setDepId ( Integer depId ) {
        this.depId = depId;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String  getRegTime ( ) {
        return regTime;
    }

    public void setRegTime ( String regTime ) {
        this.regTime = regTime;
    }

    public String  getLastLogTime ( ) {
        return lastLogTime;
    }

    public void setLastLogTime ( String  lastLogTime ) {
        this.lastLogTime = lastLogTime;
    }

    @Override
    public String toString ( ) {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", depId=" + depId +
                ", email='" + email + '\'' +
                ", regTime='" + regTime + '\'' +
                ", lastLogTime='" + lastLogTime + '\'' +
                '}';
    }
}
