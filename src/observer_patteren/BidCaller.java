package observer_patteren;

public class BidCaller extends Observer{

	public BidCaller(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	public void BidCall(int bidAmount){
		if(bidAmount > subject.getState()){
			subject.setState(bidAmount);
		}else{
			System.out.println("bid is below the current bid, so it is not acceptable");
		}
	}

	@Override
	public void update() {
		System.out.println( "New Bid called, current bid updated to: " + subject.getState() ); 
	}
}