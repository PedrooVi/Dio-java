package dio.dio_spring_security_jwt.security;

import java.sql.Date;
import java.util.List;

public class JWTObject {
    private String subject; //nome do usuario
    private Date issuedAt; //data de criação do token
    private Date expiration; // data de expiração do token
    private List<String> roles; //perfis de acesso
    

    
    public String getSubject() {
        return subject;
    }



    public void setSubject(String subject) {
        this.subject = subject;
    }



    public Date getIssuedAt() {
        return issuedAt;
    }



    public void setIssuedAt(java.util.Date date) {
        this.issuedAt = (Date) date;
    }



    public Date getExpiration() {
        return expiration;
    }



    public void setExpiration(java.util.Date date) {
        this.expiration = (Date) date;
    }



    public List<String> getRoles() {
        return roles;
    }



    public void setRoles(List<String> roles) {
        this.roles = roles;
    }



    public void setIssuedAt(java.util.Date issuedAt2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIssuedAt'");
    }

}
