import com.yourapp.Role
import com.yourapp.User
import com.yourapp.UserRole

class BootStrap {

    def init = { servletContext ->
        Role role = new Role(authority: 'ROLE_USER').save flush: true

        User user = new User(username: "admin", password: "pass").save flush: true;
        UserRole.create user, role, true
    }
    def destroy = {
    }
}
