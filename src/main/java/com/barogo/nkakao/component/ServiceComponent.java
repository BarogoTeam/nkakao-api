package com.barogo.nkakao.component;

import com.barogo.nkakao.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Service 컴포넌트
 * @author Thesun
 * @version 0.0.1
 */

@Component
public class ServiceComponent {

    @Autowired
    private MainService mainService;

    public MainService getMainService() { return mainService; }
}
