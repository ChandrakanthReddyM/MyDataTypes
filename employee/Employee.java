package mydatatypes.employee;
public class Employee {
	public int id;
	public char []name;
	public char []emailID;
	public long phoneNumber;
	public short age;
	public double salary;
	public void work()
	{
	}
	public void updateWork()
	{
	}
	public Employee(int id1,char []name1,long phoneNumber1,short age1,double salary1)
	{
		id=id1;
		age=age1;
		name=name1;
		phoneNumber=phoneNumber1;
		salary=salary1;
	}
	public Employee(int id1)
	{
		id=id1;
	}
	public Employee(char []name1)
	{
		name=name1;
	}
	public Employee(long phoneNumber1)
	{
		phoneNumber=phoneNumber1;
	}
	public Employee(short age1)
	{
		age=age1;
	}
	public Employee(double salary1)
	{
		salary=salary1;
	}
	public Employee()
	{
		id=-1;
		age=-1;
		name=name;
		phoneNumber=-1;
		salary=-1;
	}
}