package hello.helloSpring.controller;

import hello.helloSpring.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final memberService memberService;

    @Autowired
    public MemberController(hello.helloSpring.service.memberService memberService) {
        this.memberService = memberService;
    }
}
