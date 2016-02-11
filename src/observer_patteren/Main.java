package observer_patteren;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world, welcome to my auction system");
		
		Subject auctioneer = new Subject();

		BidCaller bc1 = new BidCaller(auctioneer);
		BidCaller bc2 = new BidCaller(auctioneer);
		BidCaller bc3 = new BidCaller(auctioneer);
		BidCaller bc4 = new BidCaller(auctioneer);
		
		System.out.println("bc1 bid 7");
		bc1.BidCall(7);
		System.out.println("bc2 bid 10");
		bc2.BidCall(10);
		System.out.println("bc3 bid 8");
		bc3.BidCall(8);
		System.out.println("bc4 bid 15");
		bc4.BidCall(15);
	}
}
