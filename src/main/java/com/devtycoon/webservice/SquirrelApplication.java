package com.devtycoon.webservice;

        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.builder.SpringApplicationBuilder;
        import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class SquirrelApplication {
    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/app/config/Squirrel/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(SquirrelApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }
}
