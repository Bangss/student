package neusoft.pojo;

public class Ask {
    private Integer stuId;
    private String reason;
    private Integer sta;

    public Ask ( ) {
    }

    public Integer getStuId ( ) {
        return stuId;
    }

    public void setStuId ( Integer stuId ) {
        this.stuId = stuId;
    }

    public String getReason ( ) {
        return reason;
    }

    public void setReason ( String reason ) {
        this.reason = reason;
    }

    public Integer getSta ( ) {
        return sta;
    }

    public void setSta ( Integer sta ) {
        this.sta = sta;
    }

    public Ask ( Integer stuId, String reason, Integer sta ) {
        this.stuId = stuId;
        this.reason = reason;
        this.sta = sta;
    }

    @Override
    public String toString ( ) {
        return "Ask{" +
                "stuId=" + stuId +
                ", reason='" + reason + '\'' +
                ", sta=" + sta +
                '}';
    }
}
