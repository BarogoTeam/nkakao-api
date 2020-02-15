package com.barogo.nkakao.service;

import org.springframework.stereotype.Service;

@Service  //TODO Transactional 테그
public class MainServiceImpl implements MainService{

    //TODO Mapper

    public String apiCheck(){
        return "alive";
    }
}
