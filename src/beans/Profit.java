package beans;
//������
public class Profit {
	//��ƷID
	private int goodsId;
	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	//��Ʒ����
	private String goodsName;
	//�ɱ���
	private int costPrice;
	//�ۼ�
	private int sellingPrice;
	//��������
	private int tradingNum;
	//���״���
	private int times;
	//��Ʒ����
	private int profit;
	
	public Profit(){
		
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}
	public int getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public int getTradingNum() {
		return tradingNum;
	}
	public void setTradingNum(int tradingNum) {
		this.tradingNum = tradingNum;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	
}