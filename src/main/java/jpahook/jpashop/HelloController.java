package jpahook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("hello")
  public String hello(Model model) {
    model.addAttribute("data", "hello"); // model은 데이터를 담아서 전달하는 매체
    return "hello"; // hello는 파일이름이며 hello.html을 뜻한다.
  }

}
