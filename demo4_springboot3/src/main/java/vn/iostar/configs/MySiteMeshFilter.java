package vn.iostar.configs;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class MySiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/*", "/user.jsp")
                .addDecoratorPath("/admin/*", "/admin.jsp")
                .addExcludedPath("/manager/*")
                .addExcludedPath("/v1/api/*");
    }
}
