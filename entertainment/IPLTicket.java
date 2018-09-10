package mydatatypes.entertainment;

public class IPLTicket {
	public char []team;
	public double price;
	public int []seatNo;
	public char []stadiumLocation;
	public char []stadiumName;
	public char []typeOfSeat;
	public short noOfTickets;
	public double []time;
	public int []date;
	public void xyz()
	{
	}
	public void abc()
	{
	}
	public IPLTicket()
	{
		char []team={'-','-','-','-'};
		double price=-1;
		int []seatNo={'-','-','-','-'};
		char []stadiumLocation={'-','-','-','-'};
		char []stadiumName={'-','-','-','-'};
		char []typeOfSeat={'-','-','-','-'};
		short noOfTickets=-1;
		double []time={'-','-','-','-'};
		int []date={'-','-','-','-'};
	}
	public IPLTicket(char []team1,double price1,int []seatNo1,
	char []stadiumLocation1,char []stadiumName1,char []typeOfSeat1,short noOfTickets1,double []time1,int []date1)
	{
		char []team=team1;
		double price=price1;
		int []seatNo=seatNo1;
		char []stadiumLocation=stadiumLocation1;
		char []stadiumName=stadiumName1;
		char []typeOfSeat=typeOfSeat1;
		short noOfTickets=noOfTickets1;
		double []time=time1;
		int []date=date1;
	}

}
