package com.logo.service;

import com.logo.model.Product;
import com.logo.model.ShowWindow;
import com.logo.repository.ShowWindowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowWindowService {

    @Autowired
    private ShowWindowRepository showWindowRepository;
    public ShowWindow createShowWindow(ShowWindow request) {
        return showWindowRepository.save(request);
    }
    public List<Product> getProductsByUrl(String url) {
        Optional<ShowWindow> foundProduct = showWindowRepository.findByUrl(url);

        if (foundProduct.isPresent()) {
            return foundProduct.get().getProductList();
        }
        return null;
    }
    public List<ShowWindow> getAllShowWindow() {
        return showWindowRepository.findAll();
    }
    public void update(ShowWindow showWindow) {
        showWindowRepository.save(showWindow);
    }
}
