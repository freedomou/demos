package pojo;

public class HelloSpring {
    private String userName;

    public HelloSpring(){}
    public HelloSpring(String userName){
        this.userName=userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show() {
        System.out.println(userName + ":欢迎来到Spring");
    }

}
