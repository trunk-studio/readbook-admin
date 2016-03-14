package org.lightadmin.boot.administration;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FiltersConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.FiltersConfigurationUnit;
import org.lightadmin.api.config.utils.EnumElement;
import org.lightadmin.boot.domain.Book;

import static org.lightadmin.api.config.utils.Editors.textArea;

public class BookAdministration extends AdministrationConfiguration<Book> {

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {

        return fragmentBuilder
                .field("eBookGuid").caption("eBookGuid")
                .field("name").caption("name")
                .field("totalPageNumber").caption("totalPageNumber")
                .field("isPublish").caption("isPublish")
                .field("isS3Ready").caption("isS3Ready")
                .field("doneDate").caption("doneDate")
                .field("articleAuthor").caption("articleAuthor")
                .field("doneDate").caption("doneDate")
                .field("publisher").caption("publisher")
                .field("editor").caption("editor")
                .field("ean").caption("ean")
                .field("isbn").caption("isbn")
                .field("longDescription").caption("longDescription").editor(textArea())
                .field("type").caption("type")
                .enumeration(
                        EnumElement.element(0, "image"),
                        EnumElement.element(1, "epub"),
                        EnumElement.element(2, "html")
                )
                .build();
    }
//
//    public FiltersConfigurationUnit filters( final FiltersConfigurationUnitBuilder filterBuilder ) {
//        return filterBuilder
//                .filter("Site", "site")
//                .filter("Booked Hotel", "hotel" )
//                .filter( "Check-In Date", "checkinDate" )
//                .filter( "Check-Out Date", "checkoutDate" )
//                .filter( "Smoking", "smoking" ).build();
//    }
}