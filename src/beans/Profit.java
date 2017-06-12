package beans;
//利润类
public class Profit {
	//商品ID
	private int goodsId;
	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	//商品名称
	private String goodsName;
	//成本价
	private int costPrice;
	//售价
	private int sellingPrice;
	//交易数量
	private int tradingNum;
	//交易次数
	private int times;
	//商品利润
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
