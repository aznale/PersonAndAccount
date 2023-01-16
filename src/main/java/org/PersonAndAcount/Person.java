package org.PersonAndAcount;

import lombok.Getter;
import lombok.Setter;

public class Person {
    private @Getter @Setter String name;
    private @Getter @Setter String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
