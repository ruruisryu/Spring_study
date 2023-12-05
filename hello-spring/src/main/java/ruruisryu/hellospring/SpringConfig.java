package ruruisryu.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ruruisryu.hellospring.repository.MemberRepository;
import ruruisryu.hellospring.repository.MemoryMemberRepository;
import ruruisryu.hellospring.service.MemberService;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
