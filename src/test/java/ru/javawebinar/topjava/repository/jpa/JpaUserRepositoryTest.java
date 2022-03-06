package ru.javawebinar.topjava.repository.jpa;

import org.junit.Test;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.UserServiceTest;

import static org.junit.Assert.*;
@ActiveProfiles(Profiles.JPA)
public class JpaUserRepositoryTest extends UserServiceTest {


}