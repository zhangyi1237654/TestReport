package beans;
//订单类
public class TradingInf {
	//交易ID
	private int tradingId;
	//交易商品ID
	private int tradingGoodsId;
	//交易买家ID
	private int UserId;
	//交易数量
	private int tradingNumber;
	
	public TradingInf(){
		
	}

	public int getTradingId() {
		return tradingId;
	}

	public void setTradingId(int tradingId) {
		this.tradingId = tradingId;
	}

	public int getTradingGoodsId() {
		return tradingGoodsId;
	}

	public void setTradingGoodsId(int tradingGoodsId) {
		this.tradingGoodsId = tradingGoodsId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public int getTradingNumber() {
		return tradingNumber;
	}

	public void setTradingNumber(int tradingNumber) {
		this.tradingNumber = tradingNumber;
	}
	
	
}
