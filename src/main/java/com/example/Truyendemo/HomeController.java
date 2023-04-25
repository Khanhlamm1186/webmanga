package com.example.Truyendemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller //annotation xác định class này là Controller
public class HomeController {
    //Khi người dùng truy cập vào qua phương thức GET thì sẽ được đưa tới đây để xử lý
    @GetMapping("/")
    public String homePage() {
        //Trả về trang index.html (trang chủ)
        return "Homepage";
    }
    @GetMapping("/CRUDadm2002")
    public String CRUDpage() {
        //Trả về trang index.html (trang chủ)
        return "CRUD";
    }
    @GetMapping("/Login")
    public String Loginpage() {
        //Trả về trang index.html (trang chủ)
        return "Login";
    }
    @GetMapping("/listSp")
    public String listSpPage() {
        //Trả về trang index.html (trang chủ)
        return "dssanpham";
    }

    @GetMapping("/Detail/{id}")
    public String Detailpage(@PathVariable int id) {
        System.out.println(id);

        return "Detail";
    }
}