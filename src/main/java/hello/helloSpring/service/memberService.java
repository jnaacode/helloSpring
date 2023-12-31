package hello.helloSpring.service;

import hello.helloSpring.domain.Member;
import hello.helloSpring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class memberService {

    private final MemberRepository memberRepository;

    @Autowired
    public memberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*회원 가입 */
    public Long join(Member member){

        // 같은 이름이 있는 중복 회원 x
        extracted(member);

        memberRepository.save(member);
        return  member.getId();
    }

    private void extracted(Member member) {
        memberRepository.findyByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /*전체 회원 조회*/
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }
    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }

}