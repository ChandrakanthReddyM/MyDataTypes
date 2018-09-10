package mydatatypes.social;

public class Mail {
	public char []firstName;
	public char []lastName;
	public char []emailID;
	public char []password;
	public void login()
	{
	}
	public void compose()
	{
	}
	public void sendMail()
	{
	}
	public void logout()
	{
	}
	public Mail(char []firstName1,char []lastName1,char []emailID1,char []password1)
	{
		char []firstName=firstName1;
		char []lastName=lastName1;
		char []emailID=emailID1;
		char []password=password1;
	}
	public Mail()
	{
		char []firstName={'-','-','-','-'};
		char []lastName={'-','-','-','-'};
		char []emailID={'-','-','-','-'};
		char []password={'-','-','-','-'};
	}
}
