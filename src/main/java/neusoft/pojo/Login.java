package neusoft.pojo;

public class Login {
    private Integer id;
    private String password;
    private Integer sup;

    public Login ( ) {
    }

    public Login ( Integer id, String password, Integer sup ) {
        this.id = id;
        this.password = password;
        this.sup = sup;
    }

    public Integer getId ( ) {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public String getPassword ( ) {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    public Integer getSup ( ) {
        return sup;
    }

    public void setSup ( Integer sup ) {
        this.sup = sup;
    }

    @Override
    public String toString ( ) {
        return "Login{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", sup=" + sup +
                '}';
    }
}
