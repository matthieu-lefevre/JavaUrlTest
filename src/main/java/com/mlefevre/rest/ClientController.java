package com.mlefevre.rest;

import com.mlefevre.rest.client.RestClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.HashMap;

@Controller
@RequestMapping("/client")
public class ClientController {

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public void search(@RequestBody String item) {

        try {
            URI uri = new URI(
              "http",
              null,
              "localhost",
              8080,
              "/webservice/search/" + item,
              null,
              null
            );

            System.out.println(uri.toString());
            URL url = uri.toURL();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();




            /*System.out.println(uri.toString());

            RestClient client = new RestClient();
            client.get(uri, new HashMap<String, Object>(), String.class);*/

        } catch(URISyntaxException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}
