package org.lightadmin.boot.administration;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.boot.domain.SiteProfile;

import static org.lightadmin.api.config.utils.Editors.wysiwyg;
import static org.lightadmin.api.config.utils.Editors.textArea;

public class SiteProfileAdministration extends AdministrationConfiguration<SiteProfile> {

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
            .field("allowFrom").caption("allowFrom")
            .field("viewerLoginImageUrl").caption("ViewerLoginImageUrl")
            .field("rightsDescription").caption("RightsDescription").editor(textArea())
            .field("loginPageHtml").caption("LoginPageHtml").editor(wysiwyg())
            .build();
    }
}