package org.lightadmin.boot.administration;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FiltersConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.FiltersConfigurationUnit;
import org.lightadmin.api.config.utils.EnumElement;
import org.lightadmin.boot.domain.User;

public class UserAdministration extends AdministrationConfiguration<User> {

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {

        return fragmentBuilder
                .field("userGuid").caption("userGuid")
                .field("loginId").caption("loginId")
                .field("password").caption("password")
                .field("email").caption("email")
                .field("username").caption("username")
                .field("fullName").caption("fullName")
                .field("gender").caption("Gender")
                .enumeration(
                        EnumElement.element(0, "none"),
                        EnumElement.element(1, "male"),
                        EnumElement.element(2, "female")
                )
                .field("siteId").caption("siteId")
                .build();
    }


    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder ) {
        return filterBuilder
                .filter("Site", "siteId")
                .build();
    }
}