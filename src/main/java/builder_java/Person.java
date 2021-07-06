package builder_java;

/**
 * @author angus
 * @date 2019/11/20
 */
public class Person {
    private String name;
    private int age;
    private Contact contact;
    private Address addr;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.contact = builder.contact;
        this.addr = builder.addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contact=" + contact +
                ", addr=" + addr +
                '}';
    }

    public static class Builder {
        private String name;
        private int age;
        private Contact contact;
        private Address addr;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder addr(Address addr) {
            this.addr = addr;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person p = new Builder("Angus", 23)
                .addr(new Address("四川", "成都", "鹤山街道"))
                .contact(new Contact("18328635851", "1713862733", "Lu"))
                .build();
        System.out.println(p);
    }
}


