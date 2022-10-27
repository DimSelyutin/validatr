package by.social.main.validator.bean;

import java.io.Serializable;

public class UserInfo implements Serializable{
    private final long SerialUID = 1L;

    private String email;
    private String password;
    private String phoneNumber;
    private String dateBirthday;


   
    public UserInfo(String email, String password, String phoneNumber, String dateBirthday) {
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dateBirthday = dateBirthday;
    }




    public UserInfo(){

    }

    

    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getDateBirthday() {
        return dateBirthday;
    }
    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (SerialUID ^ (SerialUID >>> 32));
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + ((dateBirthday == null) ? 0 : dateBirthday.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserInfo other = (UserInfo) obj;
        if (SerialUID != other.SerialUID)
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (dateBirthday == null) {
            if (other.dateBirthday != null)
                return false;
        } else if (!dateBirthday.equals(other.dateBirthday))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "UserInfo [SerialUID=" + SerialUID + ", email=" + email + ", password=" + password + ", phoneNumber="
                + phoneNumber + ", dateBirthday=" + dateBirthday + "]";
    }


    
    



}
