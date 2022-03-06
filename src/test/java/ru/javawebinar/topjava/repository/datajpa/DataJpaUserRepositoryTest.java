package ru.javawebinar.topjava.repository.datajpa;

import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.UserServiceTest;

import static org.junit.Assert.*;
@ActiveProfiles(Profiles.DATAJPA)
public class DataJpaUserRepositoryTest extends UserServiceTest {

}