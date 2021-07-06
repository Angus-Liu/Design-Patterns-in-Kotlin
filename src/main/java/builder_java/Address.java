package builder_java;

/**
 * @author angus
 * @date 2019/11/20
 */
public class Address {
    private String province;
    private String city;
    private String street;

    public Address(String province, String city, String street) {
        this.province = province;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
