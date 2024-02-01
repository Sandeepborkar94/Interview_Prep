package hibernate.practice.first;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Student_Table",  uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "Adress")
})

public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int sid;
	
	@Column(name = "Name", unique = true, nullable = false,length = 100)
	private String snmae;
	
	@Column(name = "Address", unique = true, nullable = false,length = 100)
	private String saddress;
	
	@Column(name = "Email", unique = true, nullable = false,length = 100)
	private String sEmail;
	
	
	public String getsEmail() 
	{
		return sEmail;
	}
	
	public void setsEmail(String sEmail)
	{
		this.sEmail = sEmail;
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getSnmae() 
	{
		return snmae;
	}
	public void setSnmae(String snmae)
	{
		this.snmae = snmae;
	}
	public String getSaddress()
	{
		return saddress;
	}
	public void setSaddress(String saddress) 
	{
		this.saddress = saddress;
	}
	
	
	
	
	

}
