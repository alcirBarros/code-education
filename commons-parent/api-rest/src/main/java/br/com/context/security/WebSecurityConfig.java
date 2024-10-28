//package br.com.apirest.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private JwtTokenProvider jwtTokenProvider;
//
//	@Autowired
//	private MyUserDetails myUserDetails;
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		// Disable CSRF (cross site request forgery)
//		http.csrf().disable();
//
//		// No session will be created or used by spring security
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//		// Entry points
//		http.authorizeRequests()//
//		.antMatchers("/v1/security/signin").permitAll()
//		.antMatchers("/v1/security/rolelist").permitAll()
//		.antMatchers("/h2/**/**").permitAll()
//
//		.antMatchers(HttpMethod.GET, "/v1/client/**").hasAuthority("VIS_CLIENTE")
//		.antMatchers(HttpMethod.POST, "/v1/client/**").hasAuthority("CAD_CLIENTE")
//		.antMatchers(HttpMethod.PUT, "/v1/client/**").hasAuthority("ALT_CLIENTE")
//		.antMatchers(HttpMethod.DELETE, "/v1/client/**").hasAuthority("EXC_CLIENTE")
//		// secured everything
//		.antMatchers(HttpMethod.GET, "/v1/order/**").hasAuthority("VIS_VENDA")
//		.antMatchers(HttpMethod.POST, "/v1/order/**").hasAuthority("CAD_VENDA")
//		.antMatchers(HttpMethod.PUT, "/v1/order/**").hasAuthority("ALT_VENDA")
//		.antMatchers(HttpMethod.DELETE, "/v1/order/**").hasAuthority("EXC_VENDA")
//
//		.antMatchers(HttpMethod.GET, "/v1/product/**").hasAuthority("VIS_PRODUTO")
//		.antMatchers(HttpMethod.POST, "/v1/product/**").hasAuthority("CAD_PRODUTO")
//		.antMatchers(HttpMethod.PUT, "/v1/product/**").hasAuthority("ALT_PRODUTO")
//		.antMatchers(HttpMethod.DELETE, "/v1/product/**").hasAuthority("EXC_PRODUTO")
//
//		.antMatchers(HttpMethod.GET, "/v1/supply/**").hasAuthority("VIS_CATEGORIA")
//		.antMatchers(HttpMethod.POST, "/v1/supply/**").hasAuthority("CAD_CATEGORIA")
//		.antMatchers(HttpMethod.PUT, "/v1/supply/**").hasAuthority("ALT_CATEGORIA")
//		.antMatchers(HttpMethod.DELETE, "/v1/supply/**").hasAuthority("EXC_CATEGORIA")
//
//		.antMatchers(HttpMethod.GET, "/v1/user/**").hasAuthority("VIS_USUARIO")
//		.antMatchers(HttpMethod.POST, "/v1/user/**").hasAuthority("CAD_USUARIO")
//		.antMatchers(HttpMethod.PUT, "/v1/user/**").hasAuthority("ALT_USUARIO")
//		.antMatchers(HttpMethod.DELETE, "/v1/user/**").hasAuthority("EXC_USUARIO")
//
//		.antMatchers(HttpMethod.GET, "/v1/category/**").hasAuthority("VIS_CATEGORIA")
//		.antMatchers(HttpMethod.POST, "/v1/category/**").hasAuthority("CAD_CATEGORIA")
//		.antMatchers(HttpMethod.PUT, "/v1/category/**").hasAuthority("ALT_CATEGORIA")
//		.antMatchers(HttpMethod.DELETE, "/v1/category/**").hasAuthority("EXC_CATEGORIA")
//		// Disallow everything else..
//		.anyRequest().authenticated();
//
//		// If a user try to access a resource without having enough permissions
//		http.exceptionHandling().accessDeniedPage("/v1/user/signin");
//
//		// Apply JWT
//		http.apply(new JwtTokenFilterConfigurer(jwtTokenProvider));
//
//		// Optional, if you want to test the API from a browser
//		// http.httpBasic();
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		// Allow swagger to be accessed without authentication
//		web.ignoring().antMatchers("/v2/api-docs")//
//		.antMatchers("/swagger-resources/**")//
//		.antMatchers("/swagger-ui.html")//
//		.antMatchers("/configuration/**")//
//		.antMatchers("/webjars/**")//
//		.antMatchers("/public")
//
//		// Un-secure H2 Database (for testing purposes, H2 console shouldn't be unprotected in production)
//		.and()
//		.ignoring()
//		.antMatchers("/h2/**/**");;
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder(12);
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception
//	{
//	    auth.parentAuthenticationManager(authenticationManagerBean())
//	        .userDetailsService(myUserDetails);
//	}
//
//	@Override
//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//	    return super.authenticationManagerBean();
//	}
//
//
//}
