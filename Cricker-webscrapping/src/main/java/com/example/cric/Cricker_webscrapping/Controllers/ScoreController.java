package com.example.cric.Cricker_webscrapping.Controllers;

import com.example.cric.Cricker_webscrapping.Models.Score;
import com.example.cric.Cricker_webscrapping.Services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cricket")
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/live-score")
    public Score getPlayerDetails() {
        return scoreService.liveScore();
    }
}
