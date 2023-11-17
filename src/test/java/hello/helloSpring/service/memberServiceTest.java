package hello.helloSpring.service;

import hello.helloSpring.controller.domain.Member;
import hello.helloSpring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class memberServiceTest {

    memberService memberService = new memberService();
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach(){
        memberRepository = new MemoryMemberRepository();
        memberService = new memberService(memberRepository);
    }

    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void 회원가입() {

        // given
        Member member = new Member();
        member.setName("hello");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());

    }


    @Test
    public void 중복회원예약(){

        // given
        Member member1 = new Member();
        member1.setName("spring");
        Member member2 = new Member();
        member2.setName("spring");

        // when
        memberService.join(member1);

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

        /* //then
        try{
            memberService.join(member2);
            fail();
        }catch (IllegalStateException e){
            // assertThat을 통해 두 객체가 같은지 확인한다.
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }*/


    }
    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}