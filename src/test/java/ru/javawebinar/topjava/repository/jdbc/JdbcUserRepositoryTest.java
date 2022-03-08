package ru.javawebinar.topjava.repository.jdbc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.MealTestData;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.service.UserService;
import ru.javawebinar.topjava.service.UserServiceTest;

import static org.junit.Assert.*;
import static ru.javawebinar.topjava.UserTestData.*;

@ActiveProfiles(Profiles.JDBC)
public class JdbcUserRepositoryTest extends UserServiceTest {

}