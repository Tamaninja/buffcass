package me.tamaninja.buffcass.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RedirectController {

    @GetMapping("/discord")
    public String discordRedirect() {
        return ("discord.html");
    }

    @GetMapping("/twitch")
    public String twitchRedirect() {
        return ("twitch.html");
    }
}
