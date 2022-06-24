package com.logo.controller;

import com.logo.model.Product;
import com.logo.model.ShowWindow;
import com.logo.service.ShowWindowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/StoreInformation")
public class ShowWindowController {

    @Autowired
    private ShowWindowService showWindowService;

    @PostMapping
    public ShowWindow createShowWindow(@RequestBody ShowWindow showWindowRequest){
        return showWindowService.createShowWindow(showWindowRequest);
    }

    @GetMapping
    public List<ShowWindow>getAllShowWindow(){
        return showWindowService.getAllShowWindow();
    }

    @GetMapping(value = "/{url}/products")
    public List<Product> getProductsByUrl(@PathVariable String url){
        return showWindowService.getProductsByUrl(url);
    }

    @PutMapping
    public ShowWindow update(@RequestBody ShowWindow showWindow){
        showWindowService.update(showWindow);
        return showWindow;
    }

}
