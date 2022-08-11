package ServiceApp.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity


public class UserModel {

    // how should our tables look?

    @Id
    @Column(unique = true)
    private String userID;

    @Column
    private String fName;

    @Column
    private String lName;

    @Column
    private String dob;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String zipcode;


}
