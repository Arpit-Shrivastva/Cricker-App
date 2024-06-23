package com.example.cric.Cricker_webscrapping.Services;

import com.example.cric.Cricker_webscrapping.Models.Score;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;


import java.io.IOException;

@Service
public class ScoreService {

    public Score liveScore() {
        Score score = new Score();
        String url = "https://www.google.com/search?q=tomorrow+match+england+and+oman";
        try {
            // Fetch the HTML content from the URL
            Document document = Jsoup.connect(url).get();

            // Find the score container element
            Element scoreContainer = document.selectFirst(".imso_mh__scr-sep .imspo_mh_cricket__first-score");

            if (scoreContainer != null) {
                // Extract the score major and score minor elements
                Element scoreMajorElement = scoreContainer.selectFirst(".imspo_mh_cricket__score-major");
                Element scoreMinorElement = scoreContainer.selectFirst(".imspo_mh_cricket__score-minor");

                // Get the text content of score major and score minor
                String scoreMajor = scoreMajorElement != null ? scoreMajorElement.text() : "";
                String scoreMinor = scoreMinorElement != null ? scoreMinorElement.text() : "";

                // Split scoreMajor into runs and wickets
                String[] scoreParts = scoreMajor.split("/");
                if (scoreParts.length == 2) {
                    score.setRun(scoreParts[0].trim());
                    score.setOut(scoreParts[1].trim());
                } else {
                    score.setRun(scoreMajor.trim());
                    score.setOut("0"); // Handle if wickets info is not available
                }
                score.setOver(scoreMinor.trim());
            } else {
                System.out.println("Score container not found");
                // Handle this case, e.g., set an error message in scoreDto
            }
        } catch (IOException e) {
            e.printStackTrace(); // Consider logging this exception properly
            // Handle this case, e.g., set an error message in scoreDto
        }
        return score;
    }
}
