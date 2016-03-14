package org.lightadmin.boot.administration;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.boot.domain.Site;

public class SiteAdministration extends AdministrationConfiguration<Site> {

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.build();
    }
//
//    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
//
//        return fragmentBuilder
//                .field("name").caption("name")
//                .field("domainName").caption("domainName")
//                .field("allowFrom").caption("allowFrom")
//                .field("siteProfile").caption("siteProfile")
//                .build();
//    }
}