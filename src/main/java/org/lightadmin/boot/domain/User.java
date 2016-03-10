package org.lightadmin.boot.domain;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(columnDefinition = "char(36) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String id;

    @Column(name = "userGuid", columnDefinition = "char(36) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String userGuid;

    @Column(name = "loginId", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String loginId;

    @Column(name = "password", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String password;

    @Column(name = "email", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String email;

    @Column(name = "username", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin", unique = true)
    private String username;

    @Column(name = "fullName", columnDefinition = "varchar(255) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private String fullName;

    @Column(columnDefinition = "ENUM('none','male','female') BINARY DEFAULT 'none'")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
