package org.keycloak.config;

public class RobotsTxt {

    public static final Option<Boolean> ROBOTS_TXT_ENABLED = new OptionBuilder<>("robots-txt-enabled", Boolean.class)
            .category(OptionCategory.GENERAL)
            .description("Whether to use it or not.")
            .defaultValue(Boolean.TRUE)
            .build();
            
    public static final Option<String> ROBOTS_TXT_CONTENTS = new OptionBuilder<>("robots-txt-contents", String.class)
            .category(OptionCategory.GENERAL)
            .description("Robots txt value")
            .defaultValue("User-agent: *\n" + "Disallow: /")
            .build();

}
