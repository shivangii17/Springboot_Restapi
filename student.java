package com.restapi.resrcs.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data  // This annotation is from the Lombok library and is used to 
// automatically generate boilerplate code such as getters, setters, toString,
//  equals, and hashCode methods for the class. By using @Data, you can avoid writing 
// these methods manually, making your code cleaner and more concise.    
@AllArgsConstructor // This annotation is also from the Lombok library and 
// is used to generate a constructor that takes all the fields of the class
//  as parameters. In this case, it will generate a constructor that takes id,
//  name, and email as parameters. This allows you to create instances of the 
// student
public class student {
    private long id;
    private String name;
    private String email;
}
