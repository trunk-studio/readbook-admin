package org.lightadmin.boot.domain;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "SiteProfiles")
public class SiteProfile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "int(11)")
    private Integer id;

    @Column(name = "allowFrom", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String allowFrom;

    @Column(name = "ViewerLoginImageUrl", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String viewerLoginImageUrl;

    @Column(name = "RightsDescription", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String rightsDescription;

    @Column(name = "LoginPageHtml", columnDefinition = "TEXT BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String loginPageHtml;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAllowFrom() {
        return allowFrom;
    }

    public void setAllowFrom(String allowFrom) {
        this.allowFrom = allowFrom;
    }

    public String getViewerLoginImageUrl() {
        return viewerLoginImageUrl;
    }

    public void setViewerLoginImageUrl(String viewerLoginImageUrl) {
        this.viewerLoginImageUrl = viewerLoginImageUrl;
    }

    public String getRightsDescription() {
        return rightsDescription;
    }

    public void setRightsDescription(String rightsDescription) {
        this.rightsDescription = rightsDescription;
    }

    public String getLoginPageHtml() {
        return loginPageHtml;
    }

    public void setLoginPageHtml(String loginPageHtml) {
        this.loginPageHtml = loginPageHtml;
    }
}
