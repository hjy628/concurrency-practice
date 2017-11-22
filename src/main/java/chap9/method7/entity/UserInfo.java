package chap9.method7.entity;

/**
 * Created by hjy on 17-11-22.
 */
public class UserInfo {

    private String username;

    public UserInfo( ) {
        super();
    }

    public UserInfo(String username) {
        super();
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
