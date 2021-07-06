package builder_java;

/**
 * @author angus
 * @date 2019/11/22
 */
public class Contact {
    private String phone;
    private String qq;
    private String wechat;

    public Contact(String phone, String qq, String wechat) {
        this.phone = phone;
        this.qq = qq;
        this.wechat = wechat;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                '}';
    }
}
