package com.barogo.nkakao.controller;

import com.barogo.nkakao.component.ServiceComponent;
import com.barogo.nkakao.domain.out.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
/**
 * 메인 API 컨트롤러
 * @author Thesun
 * @version 0.0.1
 */
@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private ServiceComponent service;

    /**
     * API 서버 체크
     * @param
     * @return
     */
    @ApiOperation(value="", notes="API 서버가 살아있는지 체크")
    @GetMapping("apiCheck")
    public ResponseVO<String> apiCheck(){
        ResponseVO<String> responseVO = new ResponseVO<>();
        responseVO.setCheck(true);
        responseVO.setMessage(service.getMainService().apiCheck());
        return responseVO;
    }
}
