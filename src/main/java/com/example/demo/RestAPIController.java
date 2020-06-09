package com.example.demo;

import com.example.demo.account.AccountService;
import com.example.demo.board.BoardDo;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class RestAPIController {

    //6.09 데이터베이스저장 삽입 쿼리
    // Session session = Hibernate.getClass()

    @RequestMapping(value = "/user/login")
    public String getLoginInfo(@RequestParam("username") String username, String password){
        System.out.println("아이디 :" + username);
        System.out.println("패스워드 :" + password);
        return "login";
    }

    @RequestMapping("/signup")
    public String infoLogin2(HttpServletRequest request, String identify, String password, String password_confirm, String name, String number, String user_email) {
        System.out.println("아  이  디   :" + identify);
        System.out.println("패 스 워 드  :" + password);
        System.out.println("패스워드 확인 :" + password_confirm);
        System.out.println("이      름  :" + name);
        System.out.println("전 화 번 호  :"  + number);
        System.out.println("이   메  일  :" + user_email);


        return "/signup";
    }
    //. account Service 에서 데이터베이스에있는 가져오는방법이..
    //private AccountService accountService;
    //@GetMapping("/Account")
    //public String getListOfAccount(){
    //   System.out.println(accountService.list());
    //
    //      return test;
    //}

    public interface PageMapper{
        
    }
}
