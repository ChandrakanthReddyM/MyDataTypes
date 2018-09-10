package mydatatypes.social;

public class WhatsAppGroup {
	public char []groupName;
	public char []admin;
	public byte noOfParticipants;
	public long []phoneNumber;
	public void chat()
	{
	}
	public void videoCalling()
	{
	}
	public void voiceCalling()
	{
	}
	public WhatsAppGroup(char []groupName1,char []admin1,byte noOfParticipants1,long []phoneNumber1)
	{
		char []groupName=groupName1;
		char []admin=admin1;
		byte noOfParticipants=noOfParticipants1;
		long []phoneNumber=phoneNumber1;
	}
	public WhatsAppGroup()
	{
		char []groupName={'-','-','-','-'};
		char []admin={'-','-','-','-'};
		byte noOfParticipants=-1;
		long []phoneNumber={'-','-','-','-'};
	}
}
