package com.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {
    private static final String LAND_SESSION_ATTRIBUTE = "lang";
    private static final String DEFAULT_LANG = "en";

    @GetMapping("/session")
    public String cookies(HttpSession session, Model model) {
        var sessionLang = session.getAttribute(LAND_SESSION_ATTRIBUTE);
        model.addAttribute("lang", sessionLang != null ? sessionLang : DEFAULT_LANG);

        return "session";
    }

    @PostMapping("/session")
    public String cookies(
            HttpSession session,
            @RequestParam("language") String language) {
        session.setAttribute("lang", language);

        return "redirect:/session";
    }
}
