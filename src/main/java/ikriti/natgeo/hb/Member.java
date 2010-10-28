package ikriti.natgeo.hb;
// Generated Oct 28, 2010 2:44:05 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Member generated by hbm2java
 */
@Entity
@Table(name="member"
    ,schema="public"
)
public class Member  implements java.io.Serializable {


     private int id;
     private String guid;
     private String firstname;
     private String lastname;
     private Date dob;
     private String email;
     private String mobile;
     private Short gender;
     private String photoUrl;
     private String privateKey;
     private Date createDate;
     private Short memberStatus;
     private Set<FbUser> fbUsers = new HashSet<FbUser>(0);

    public Member() {
    }

    public Member(String guid, String firstname, String lastname, Date dob, String email, String mobile, Short gender, String photoUrl, String privateKey, Date createDate, Short memberStatus, Set<FbUser> fbUsers) {
       this.guid = guid;
       this.firstname = firstname;
       this.lastname = lastname;
       this.dob = dob;
       this.email = email;
       this.mobile = mobile;
       this.gender = gender;
       this.photoUrl = photoUrl;
       this.privateKey = privateKey;
       this.createDate = createDate;
       this.memberStatus = memberStatus;
       this.fbUsers = fbUsers;
    }
   
     @SequenceGenerator(name="generator", sequenceName="member_id_seq")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="guid")
    public String getGuid() {
        return this.guid;
    }
    
    public void setGuid(String guid) {
        this.guid = guid;
    }
    
    @Column(name="firstname")
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    @Column(name="lastname")
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dob", length=13)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="mobile")
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    @Column(name="gender")
    public Short getGender() {
        return this.gender;
    }
    
    public void setGender(Short gender) {
        this.gender = gender;
    }
    
    @Column(name="photo_url", length=500)
    public String getPhotoUrl() {
        return this.photoUrl;
    }
    
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    
    @Column(name="private_key")
    public String getPrivateKey() {
        return this.privateKey;
    }
    
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", length=29)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    @Column(name="member_status")
    public Short getMemberStatus() {
        return this.memberStatus;
    }
    
    public void setMemberStatus(Short memberStatus) {
        this.memberStatus = memberStatus;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="member")
    public Set<FbUser> getFbUsers() {
        return this.fbUsers;
    }
    
    public void setFbUsers(Set<FbUser> fbUsers) {
        this.fbUsers = fbUsers;
    }




}

