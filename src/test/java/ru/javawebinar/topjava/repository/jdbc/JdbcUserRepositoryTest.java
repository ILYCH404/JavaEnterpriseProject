package ru.javawebinar.topjava.repository.jdbc;

import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.UserServiceTest;

import static org.junit.Assert.*;
@ActiveProfiles(Profiles.JDBC)
public class JdbcUserRepositoryTest extends UserServiceTest {

}