package fr.univrouen.rss22.controllers;

import fr.univrouen.rss22.model.Item;
import fr.univrouen.rss22.model.TestRSS;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostRSSController {
    @RequestMapping(value = "/testpost", method = RequestMethod.POST,
            consumes = "application/xml")
    public String postTest(@RequestBody String flux) {
        return ("<result><response>Message reçu : </response>"
                + flux + "</result>");
    }

    @PostMapping(value = "/postrss", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String postRSS() {
        TestRSS rss = new TestRSS();
        return rss.loadFileXML();
    }


}
