package ikriti.natgeo.hb;
// Generated Oct 28, 2010 2:44:05 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FbUser generated by hbm2java
 */
@Entity
@Table(name="fb_user"
    ,schema="public"
)
public class FbUser  implements java.io.Serializable {


     private int id;
     private Member member;
     private String photoUrl;
     private Date createDate;
     private String accessToken;
     private Boolean isValidAccessToken;
     private String facebookId;

    public FbUser() {
    }

    public FbUser(Member member, String photoUrl, Date createDate, String accessToken, Boolean isValidAccessToken, String facebookId) {
       this.member = member;
       this.photoUrl = photoUrl;
       this.createDate = createDate;
       this.accessToken = accessToken;
       this.isValidAccessToken = isValidAccessToken;
       this.facebookId = facebookId;
    }
   
     @SequenceGenerator(name="generator", sequenceName="fb_user_id_seq")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="member")
    public Member getMember() {
        return this.member;
    }
    
    public void setMember(Member member) {
        this.member = member;
    }
    
    @Column(name="photo_url", length=500)
    public String getPhotoUrl() {
        return this.photoUrl;
    }
    
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", length=29)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    @Column(name="access_token", length=500)
    public String getAccessToken() {
        return this.accessToken;
    }
    
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    @Column(name="is_valid_access_token")
    public Boolean getIsValidAccessToken() {
        return this.isValidAccessToken;
    }
    
    public void setIsValidAccessToken(Boolean isValidAccessToken) {
        this.isValidAccessToken = isValidAccessToken;
    }
    
    @Column(name="facebook_id")
    public String getFacebookId() {
        return this.facebookId;
    }
    
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }




}


