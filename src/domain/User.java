package domain;

import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.*;

/**
 * Created by ������ on 20.01.2016.
 */

@Entity
@Table(name = "users") /*��� ��� ������������ ����������� � ������� users */
public class User {
    User () {

    }

    public String getUserSurname() {
        return UserSurname;
    }

    public void setUserSurname(String userSurname) {
        UserSurname = userSurname;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserMidName() {
        return UserMidName;
    }

    public void setUserMidName(String userMidName) {
        UserMidName = userMidName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public LocalGregorianCalendar.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalGregorianCalendar.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalGregorianCalendar.Date getDateStartWork() {
        return dateStartWork;
    }

    public void setDateStartWork(LocalGregorianCalendar.Date dateStartWork) {
        this.dateStartWork = dateStartWork;
    }

    public LocalGregorianCalendar.Date getDateStopWork() {
        return dateStopWork;
    }

    public void setDateStopWork(LocalGregorianCalendar.Date dateStopWork) {
        this.dateStopWork = dateStopWork;
    }

    public boolean isAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(boolean accessStatus) {
        this.accessStatus = accessStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    private String UserSurname; /*������� �����������*/
    private String UserName; /*��'� �����������*/
    private String UserMidName; /*�� ������� �����������*/
    private String login; /*���� �����������*/
    private String password; /*������ �����������*/
    private UserStatus status; /*������ - �����������, �������� � �.�.*/
    private LocalGregorianCalendar.Date dateOfBirth; /*���� ����������*/
    private LocalGregorianCalendar.Date dateStartWork; /*���� ������� ������*/
    private LocalGregorianCalendar.Date dateStopWork; /*���� ���������� ������*/
    private boolean accessStatus; /*������ �������*/
}
