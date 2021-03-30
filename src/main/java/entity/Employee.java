package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    private Long id;
    privaet String FName;
    private String LName;
    public Employee()
    {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
}
    public String getfName()
    {
     return fName;
    }
    public void setfName(String fName)
    {
    this.fName = fName;
    }
    public String getlName()
    {
     return lName;
    }
    public void setlName(String lName)
    {
     this.lName = lName;
    }
}