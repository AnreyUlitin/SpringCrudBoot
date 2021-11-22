package SpringCrudBoot.security;

import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.*;
import org.springframework.security.web.authentication.*;
import org.springframework.stereotype.*;

@Component
public class SuccessUserHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        if (roles.contains("ROLE_ADMIN")) {
            httpServletResponse.sendRedirect("/admin");
        } else {
            httpServletResponse.sendRedirect("/user");
        }
    }
}