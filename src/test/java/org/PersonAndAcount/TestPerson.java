package org.PersonAndAcount;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPerson {
    @Test
    public void personTest() {
        Faker faker = new Faker();
        Person person = new Person(faker.name().firstName(), faker.address().fullAddress());
        person.setName("Joan");
        var address = faker.address().fullAddress();
        person.setAddress(address);
        Assertions.assertEquals("Joan", person.getName());
        Assertions.assertEquals(address, person.getAddress());
    }
}
