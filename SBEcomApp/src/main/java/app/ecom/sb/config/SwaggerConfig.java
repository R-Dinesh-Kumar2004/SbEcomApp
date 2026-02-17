package app.ecom.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.version}")
	private String appVersion;
	
	@Value("${app.author}")
	private String appAuthor;
	
	@Value("${app.email}")
	private String appEmail;
	
	
	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title(appName)
						.version(appVersion)
						.description("API documentation for "+appAuthor)
						.contact(new Contact().name(appAuthor).email(appEmail)));
	}
}