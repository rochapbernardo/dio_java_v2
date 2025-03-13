package dio.spring.security.jwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {
    public static String PREFIX;
    public static String KEY;
    public static long EXPIRATION;

    public void setPREFIX(String PREFIX) {
        this.PREFIX = PREFIX;
    }

    public void setKEY(String KEY) {
        this.KEY = KEY;
    }

    public static void setEXPIRATION(long EXPIRATION) {
        SecurityConfig.EXPIRATION = EXPIRATION;
    }
}
