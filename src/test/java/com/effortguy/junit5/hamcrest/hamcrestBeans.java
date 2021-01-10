package com.effortguy.junit5.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class hamcrestBeans {

    public class Person {
        String name;
        String id;

        Person(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    @Test
    void testHasProperty() {
        Person person = new Person("peter", "spider");

        assertThat(person, hasProperty("name", is("peter")));
    }
}