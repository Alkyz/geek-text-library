package net.codejava.BookREST;
/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class ApplicationSecurityConfig {

	private final JpaUserDetailsService jpaUserDetailsService;
	
	public ApplicationSecurityConfig(JpaUserDetailsService jpaUserDetailsService) {
		this.jpaUserDetailsService = jpaUserDetailsService;
	}
	
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.csrf(csrf -> csrf.ignoringAntMatchers("goodbooksdata/books"))
				.authorizeRequests(auth -> auth
						.antMatchers("goodbooksdata/books").permitAll()
						.mvcMatchers("goodbooksdata/books").permitAll()
						.anyRequest().authenticated())
				.userDetailsService(jpaUserDetailsService)
				.headers(headers -> headers.frameOptions().sameOrigin())
				.httpBasic(Customizer.withDefaults())
				.build();
	}
	

}
*/
