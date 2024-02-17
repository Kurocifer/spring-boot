package readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends  WebSecurityConfiguration {
	
	@Autowired
	private ReaderRepository readerRepository;
	
	@SuppressWarnings("deprecation")
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.requestMatchers("/").access("hasRole('READER')")
				.requestMatchers("/**").permitAll()
				
			.and()
			
	}
	
	protected void configure(
			AuthenticationManagerBuilder auth) throws Exception {
		auth
			.userDetailsService(new UserDetailsService() {
				@Override
				public UserDetails loadUserByUsername(String username)
					throws UsernameNotFoundException {
					return readerRepository.findOne(username);
				}
			})
	}
	
}