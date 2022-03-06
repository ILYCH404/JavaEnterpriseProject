package ru.javawebinar.topjava.repository.jpa;

import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.MealServiceTest;

import static org.junit.Assert.*;
@ActiveProfiles(Profiles.JPA)
public class JpaMealRepositoryTest extends MealServiceTest {

}