package org.lightadmin.boot.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Sites")
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "int(11)")
    private Integer id;

    @Column(columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String name;

    @Column(name = "domainName", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String domainName;

    @Column(name = "allowFrom", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String allowFrom;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "SiteProfileId", referencedColumnName = "id", foreignKey = @ForeignKey(name = "SiteProfileId"))
    private SiteProfile siteProfile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getAllowFrom() {
        return allowFrom;
    }

    public void setAllowFrom(String allowFrom) {
        this.allowFrom = allowFrom;
    }

    public SiteProfile getSiteProfile() {
        return siteProfile;
    }

    public void setSiteProfile(SiteProfile siteProfile) {
        this.siteProfile = siteProfile;
    }
}
