package fr.univrouen.rss22.controllers;

import fr.univrouen.rss22.model.Item;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSSController {
    @GetMapping("/resume")
    public String getListRSSinXML(){
        return "Envoie de la liste des flux RSS";
    }

    @GetMapping("/id")
    public String getRSSinXML(@RequestParam(value = "guid") String texte){
        return ("Détail du contenu RSS demandé : "+texte);
    }

    @GetMapping("/test")
    public String testUrl(@RequestParam(value="nb") Integer guid, @RequestParam(value="search") String title) {
        return  "<li> Test: </li>" + "<li> guid: " + guid + "</li>" + "<li>titre: " + title + "</li>";
    }

    @GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Item getXML() {
        Item it = new Item("12345678","Test item","2022-05-01T11:22:33");
        return it;
    }
}
