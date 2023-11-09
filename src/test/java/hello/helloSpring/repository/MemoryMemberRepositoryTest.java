package hello.helloSpring.repository;

import hello.helloSpring.controller.domain.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
//        org.junit.jupiter.api.Assertions
//        Assertions.assertEquals(member, null); // 실패
//        Assertions.assertEquals(member, result); // 성공
        assertThat(member).isEqualTo(result);
    }
}
