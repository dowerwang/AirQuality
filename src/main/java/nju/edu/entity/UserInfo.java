package nju.edu.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "T_USERINFO")
public class UserInfo extends BaseEntity {
    @Column(name = "F_OWNERID")
    private String ownerId;
    @Column(name = "F_NICKNAME")
    private String nickName;
    @Column(name = "F_AVATARURL")
    private String avatarUrl;
    @Column(name = "F_GENDER")
    private int gender;
    @Column(name = "F_PROVINCE")
    private String province;
    @Column(name = "F_COUNTRY")
    private String country;
    @Column(name = "F_LANGUAGE")
    private String language;
    @Column(name = "F_INDIVIDUAL",length = 5000)
    private String individual;
}
