package com.example.demo;

import com.example.demo.account.AccountDo;
import com.example.demo.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RestAPIController {

    @Autowired
    private AccountService accountSerivce;

    // 계정을 입력해서 계정 생성하는 폼
    @GetMapping("/signup")
    public String form(Model model){
        model.addAttribute("title","created your information");
        model.addAttribute("Account",new AccountDo());

        return "signup";
    }
    // 저장 버튼클릭시 호출 메서드
    @PostMapping("/add")
    public String add(@ModelAttribute AccountDo account,Model model){
        AccountDo entity = accountSerivce.addAccount(account);
        model.addAttribute("result",entity);

        return "result";
    }

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

    public interface PageMapper{
        
    }
}
