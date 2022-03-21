package ru.javawebinar.topjava.util;

import org.springframework.jdbc.core.JdbcTemplate;
import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class SetAndAddUserRoles {

    private static final JdbcTemplate JDBC_TEMPLATE = new JdbcTemplate();

    public static void setRolesById(List<User> users, int id) {
        Map<Integer, Set<Role>> roles = JDBC_TEMPLATE.query("SELECT * FROM user_roles " +
                "WHERE user_id=?", new UserSetExtractorForJdbc(), id);
        users.stream()
                .filter(user -> user.getId() == id)
                .forEach(user -> user.setRoles(Objects.requireNonNull(roles).get(user.getId())));
    }

    public static void setRolesByEmail(List<User> users, String email) {
        Map<Integer, Set<Role>> roles = JDBC_TEMPLATE.query("SELECT * FROM user_roles " +
                "JOIN users u on u.id = user_roles.user_id WHERE email =?", new UserSetExtractorForJdbc(), email);
        users.stream()
                .filter(user -> user.getEmail().equals(email))
                .forEach(user -> user.setRoles(Objects.requireNonNull(roles).get(user.getId())));
    }

    public static void setAllRoles(List<User> users) {
        Map<Integer, Set<Role>> roles = JDBC_TEMPLATE.query("SELECT * FROM user_roles", new UserSetExtractorForJdbc());
        users.forEach(user -> user.setRoles(Objects.requireNonNull(roles).get(user.getId())));
    }

    public static void addRole(User user) {
        Set<Role> roles = user.getRoles();
        JDBC_TEMPLATE.batchUpdate("INSERT INTO user_roles(user_id, role) VALUES (?, ?)", roles, roles.size(),
                (ps, argument) -> {
                    ps.setInt(1, user.getId());
                    ps.setString(2, argument.name());
                });
    }
}
