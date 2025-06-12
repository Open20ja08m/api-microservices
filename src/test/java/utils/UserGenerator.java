package utils;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class UserGenerator {

    private static final Faker faker = new Faker();

    public static Map<String, Object> generateRandomUser() {
        Map<String, Object> user = new HashMap<>();
        user.put("name", faker.name().fullName());
        user.put("username", faker.name().username());
        user.put("email", faker.internet().emailAddress());
        user.put("phone", faker.phoneNumber().cellPhone());
        user.put("website", faker.internet().domainName());
        return user;
    }
}
