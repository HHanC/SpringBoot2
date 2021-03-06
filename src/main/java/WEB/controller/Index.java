package WEB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @controller : 컨트롤 어노테이션 [mvc중에 c에 해당하는 데이터 주입]
public class Index {

    @GetMapping("/main") // @getmapping : url 매핑 어노테이션 [클라이언트가 요청한 url과 연결]
    public String index(Model model){ // 해당 메소드는 url과 매핑되면 실행되는 메소드
        // view에 보내고자 하는 데이터 설정
        model.addAttribute("data","java데이터");
            //model.addAttribute("모델명" , 데이터)
        return "main"; // html파일명 // 타임리프 사용할 경우의
        // 클라이언트가 localhost:8080 요청시 springboot controller내 에서 매핑 url 찾기
        // 찾은 매핑된 메소드 실행 되면서 html 파일명 반환
    }
    // http 요청 메소드 Get vs Post
    // @GetMapping("/")
    // @PostMapping("/")
    @GetMapping("/getdata")
    @ResponseBody //  @ResponseBody : 응답객체
    public String getData() {
        return "들어왔니?";
    }
            // @ResponseBody 없을경우 html 반환[타임리프]
            // @ResponseBody 있을경우 java 객체 반환
}
