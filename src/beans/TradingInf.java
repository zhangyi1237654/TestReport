package beans;
//������
public class TradingInf {
	//����ID
	private int tradingId;
	//������ƷID
	private int tradingGoodsId;
	//�������ID
	private int UserId;
	//��������
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
