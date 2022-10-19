package by.social.main.validator.validation.bean;

import java.io.Serializable;

public class User implements Serializable{
    private final long SerialVersionUID = 1L;

    private String email;
    private String password;
    private String name;
    private String phone_number;
    

    public User(){}

    public User(String email, String password, String name, String phone_number) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone_number = phone_number;
    }

    public User(String email, String password, String phone_number) {
        this.email = email;
        this.password = password;
        this.name = "";
        this.phone_number = phone_number;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (SerialVersionUID ^ (SerialVersionUID >>> 32));
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
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
        User other = (User) obj;
        if (SerialVersionUID != other.SerialVersionUID)
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
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phone_number == null) {
            if (other.phone_number != null)
                return false;
        } else if (!phone_number.equals(other.phone_number))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [SerialVersionUID=" + SerialVersionUID + ", email=" + email + ", password=" + password + ", name="
                + name + ", phone_number=" + phone_number + "]";
    }


    
}
