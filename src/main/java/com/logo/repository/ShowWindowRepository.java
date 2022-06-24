package com.logo.repository;

import com.logo.model.ShowWindow;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ShowWindowRepository {
    private static List<ShowWindow> windowList = new ArrayList<>();
    public Optional<ShowWindow> findByUrl(String url) {
        return  windowList.stream().filter(showWindow -> showWindow.getUrl().equals(url)).findFirst();
    }
    public ShowWindow save(ShowWindow windowRequest) {
        windowList.add(windowRequest);
        return windowRequest;
    }

    public List<ShowWindow> findAll() {
        return windowList;
    }
}
