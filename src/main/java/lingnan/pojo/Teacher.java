package lingnan.pojo;

public class Teacher {
    private Integer tea_id;
    private String tea_name;
    private String gender;
    private Integer age;
    private Integer dep_id;
    private String email;
    private String reg_time;
    private String last_log_time;

    public Teacher ( ) {
    }

    public Teacher ( Integer tea_id, String tea_name, String gender, Integer age, Integer dep_id, String email, String reg_time, String last_log_time ) {
        this.tea_id = tea_id;
        this.tea_name = tea_name;
        this.gender = gender;
        this.age = age;
        this.dep_id = dep_id;
        this.email = email;
        this.reg_time = reg_time;
        this.last_log_time = last_log_time;
    }

    public Integer getTea_id ( ) {
        return tea_id;
    }

    public void setTea_id ( Integer tea_id ) {
        this.tea_id = tea_id;
    }

    public String getTea_name ( ) {
        return tea_name;
    }

    public void setTea_name ( String tea_name ) {
        this.tea_name = tea_name;
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

    public Integer getDep_id ( ) {
        return dep_id;
    }

    public void setDep_id ( Integer dep_id ) {
        this.dep_id = dep_id;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getReg_time ( ) {
        return reg_time;
    }

    public void setReg_time ( String reg_time ) {
        this.reg_time = reg_time;
    }

    public String getLast_log_time ( ) {
        return last_log_time;
    }

    public void setLast_log_time ( String last_log_time ) {
        this.last_log_time = last_log_time;
    }

    @Override
    public String toString ( ) {
        return "Teacher{" +
                "tea_id=" + tea_id +
                ", tea_name='" + tea_name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", dep_id=" + dep_id +
                ", email='" + email + '\'' +
                ", reg_time='" + reg_time + '\'' +
                ", last_log_time='" + last_log_time + '\'' +
                '}';
    }
}
