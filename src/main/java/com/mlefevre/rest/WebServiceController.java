package com.mlefevre.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@Controller
@RequestMapping("/webservice")
public class WebServiceController {

    @RequestMapping(value = "/search/{item:.+}", method = RequestMethod.GET)
    public @ResponseBody String search(@PathVariable String item) {

        return item;

        /*try {
            String decodedItem = URLDecoder.decode(item, "UTF-8");
            System.out.println(decodedItem);
            System.out.println(URLDecoder.decode(decodedItem, "UTF-8"));



        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
    }

}
