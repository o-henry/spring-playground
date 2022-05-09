package io.example.security.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

  // 신규 사용자 생성 및 로그인시 사용자 인증할때 둘다 사용하는 bean 이다.
  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(); // spring security가 제공하는 암호 인코더중 하나.
    // db에 저장된 비밀번호는 절대 decode 되지 않으며, 대신 사용자가 로그인할 때 입력하는 비밀번호는 동일한
    // 알고리즘을 사용하여 인코딩된후 db에 인코딩된 비밀번호와 비교된다.
    // 이는 passwordEncoder의 match()에서 수행된다.
  }
}
