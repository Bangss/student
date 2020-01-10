package lingnan.pojo;

public class Teacher {
    private Integer teaId;
    private String teaName;
    private String gender;
    private Integer age;
    private Integer depId;
    private String email;
    private String regTime;
    private String lastLogTime;

    public Teacher ( ) {
    }

    public Teacher ( Integer teaId, String teaName, String gender, Integer age, Integer depId, String email, String regTime, String lastLogTime ) {
        this.teaId = teaId;
        this.teaName = teaName;
        this.gender = gender;
        this.age = age;
        this.depId = depId;
        this.email = email;
        this.regTime = regTime;
        this.lastLogTime = lastLogTime;
    }

    public Integer getTeaId ( ) {
        return teaId;
    }

    public void setTeaId ( Integer teaId ) {
        this.teaId = teaId;
    }

    public String getTeaName ( ) {
        return teaName;
    }

    public void setTeaName ( String teaName ) {
        this.teaName = teaName;
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

    public String getRegTime ( ) {
        return regTime;
    }

    public void setRegTime ( String regTime ) {
        this.regTime = regTime;
    }

    public String getLastLogTime ( ) {
        return lastLogTime;
    }

    public void setLastLogTime ( String lastLogTime ) {
        this.lastLogTime = lastLogTime;
    }

    @Override
    public String toString ( ) {
        return "Teacher{" +
                "teaId=" + teaId +
                ", teaName='" + teaName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", depId=" + depId +
                ", email='" + email + '\'' +
                ", regTime='" + regTime + '\'' +
                ", lastLogTime='" + lastLogTime + '\'' +
                '}';
    }
}
