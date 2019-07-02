/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.constant;

import com.etong.framework.constant.CommonEnum;
import com.etong.framework.util.StringUtils;

/**
 * <p>
 * 订单枚举类
 * </p>
 *
 * @author: 李晓勇
 * @since: 2015年1月5日上午9:30:21
 * @version: 1.0
 */
public class OrderEnum extends CommonEnum {
	
	
	/**
	 * <p>订单分润状态</p> 
	 * @author: YZH
	 * @since: 2015年11月18日下午2:25:45
	 * @version: 1.0
	 */
	public enum ProfitStatusEnum{
		BALANCE(1,"己记帐"),PROFIT(2,"己分润"),CANCEL(3,"己撤消"),FINISH(4,"己结算完成"),BALANCE_ERROR(22,"预分润异常"),PROFIT_ERROR(33,"分润异常"),NOT_PROFIT(99,"无需分润");
		private int key;
		private String value;
		
		private ProfitStatusEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (ProfitStatusEnum en : ProfitStatusEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static ProfitStatusEnum newInstance(int key) {
			for (ProfitStatusEnum en : ProfitStatusEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}	
			return null;
		}
	}
	
	/**
	 * <p>中国移动流量充值套餐名</p> 
	 *
	 * @author: YZH
	 * @since: 2015年10月27日上午9:55:03
	 * @version: 1.0
	 */
	public enum CmccPrdEnum{
		M10("prod.10086000001992","10M"),M30("prod.10086000001993","30M"),M70("prod.10086000001994","70M"),M150("prod.10086000001995","150M"),M500("prod.10086000001996","500M");
		private String key;
		private String value;
		
		private CmccPrdEnum(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(String key) {
			for (CmccPrdEnum en : CmccPrdEnum.values()) {
				if (en.key.equals(key)) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static CmccPrdEnum newInstance(String key) {
			if( StringUtils.isNotEmpty(key) ){
				for (CmccPrdEnum en : CmccPrdEnum.values()) {
					if (en.getKey().equals(key.trim())) {
						return en;
					}
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>物流类型</p> 
	 * 1=申通   2=顺风  3=圆通  4=韵达  5=中通  6=EMS 7=宅急送 8=其他
	 * @author: 郭冬泉
	 * @since: 2015年8月11日下午8:53:14
	 * @version: 1.0
	 */
	public enum LogistTypeEnum{
		EXPRESS_DELIVERY("1","快递"),SURFACE_MAIL("2","平邮"),EMS("3","EMS"),
		STORE_PICKUP("4","门店自提"),SELF_SEND("5","送货上门"),OTHER("6","其他");
		private String key;
		private String value;
		
		private LogistTypeEnum(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(String key) {
			for (LogistTypeEnum en : LogistTypeEnum.values()) {
				if (en.key.equals(key)) {
					return en.value;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p></p> 
	 *
	 * @author: YZH
	 * @since: 2015年8月6日下午8:45:14
	 * @version: 1.0
	 */
	public enum RefundStateEnum{
		UNTREATED(0,"未处理"),STORE_AGREE(10,"卖家同意"),REFUND_OF(20,"退款中"),REFUND_ALL_OF(30,"退货退款中"),FINISH(99,"已完成");
		private int key;
		private String value;
		
		private RefundStateEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (RefundStateEnum en : RefundStateEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static RefundStateEnum newInstance(int key) {
			for (RefundStateEnum en : RefundStateEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>退款类型Enum</p> 
	 *
	 * @author: YZH
	 * @since: 2015年8月6日下午8:36:58
	 * @version: 1.0
	 */
	public enum RefundTypeEnum{
		REFUND_GOODS(1,"退货"),REFUND_FUND(2,"退款"),REFUND_ALL(3,"退货退款");
		private int key;
		private String value;
		
		private RefundTypeEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (RefundTypeEnum en : RefundTypeEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static RefundTypeEnum newInstance(int key) {
			for (RefundTypeEnum en : RefundTypeEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>订单状态</p> 
	 *
	 * @author: YZH
	 * @since: 2015年8月4日下午4:21:36
	 * @version: 1.0
	 * 订单状态：
		1=待付款
		2=已支付待发货	
		3=审核处理(商城订单流程暂时没有审核，直接跳到已发货)
		4=已发货
		5=已完成
		6=退款协议待商家确认
		7=退款中
		8=商家不同意退款
		9=客服介入退款
		10=退款退货协议待商家确认
		11=商家同意退货退款
		12=退货退款中
		13=商家不同意退货退款
		14=客服介入退货退款
		99=订单关闭(订单作废)
	    30=发货中
	 */
	public enum OrderStatusEnum{
		WAIT_PAYMENT(1,"待付款"),YET_PAYMENT(2,"已支付待发货"),WAIT_CHECK(3,"审核处理"),SHIPMENTS(4,"已发货"),FINISH(5,"已完成"),
		APPLICATION_FOR_DRAWBACK(6,"退款协议待商家确认"),REFUND_OF(7,"退款中"),STORE_REFUSED_REFUND(8,"商家不同意退款"),
		CUSTOMER_SERVICE_IN_REFUND(9,"客服介入退款"),REFUND_AGREEMENT_STORE(10,"退款退货协议待商家确认"),STORE_AGREE_REFUND(11,"商家同意退货退款"),
		ORDER_BACK(12,"退货退款中"),STORE_REFUSED_BACK(13,"商家不同意退货退款"),CUSTOMER_SERVICE_IN_BACK(14,"客服介入退货退款"),ORDER_CLOSE(99,"订单关闭"),
		MAKING(30,"发货中");

		private int key;
		private String value;
		
		private OrderStatusEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (OrderStatusEnum en : OrderStatusEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static OrderStatusEnum newInstance(int key) {
			for (OrderStatusEnum en : OrderStatusEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
		
	}
	
	/**
	 * 
	 * <p>交易完成=5</p> 
	 *交易完成=5：
		    1： 确认收货
		    2： 系统N天后自动确认收货
		    3： 退款成功
		    4： 退货退款成功
	 * @author: YZH
	 * @since: 2015年8月4日下午5:18:35
	 * @version: 1.0
	 */
	public enum OrderFinishStatusEnum{
		RECEIV_GOODS(1,"确认收货"),AUTO_RECEIV_GOODS(2,"系统自动确认收货"),REFUND_SUCCESS(3,"退款成功"),ALL_BACK_SUCCESS(4,"退货退款成功"),RISK_FINISH(5,"代付人工完成");
		private int key;
		private String value;
		
		private OrderFinishStatusEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (OrderFinishStatusEnum en : OrderFinishStatusEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static OrderFinishStatusEnum newInstance(int key) {
			for (OrderFinishStatusEnum en : OrderFinishStatusEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>订单作废</p> 
	 *订单作废=99：
		   1： 买家取消订单
		   2： 卖家取消订单
		   3： 后台人员取消订单
	 * @author: YZH
	 * @since: 2015年8月4日下午5:14:29
	 * @version: 1.0
	 */
	public enum OrderDraftStatusEnum{
		CANCELLATION_ORDER_BUYER(1,"买家取消订单"),CANCELLATION_ORDER_STORE(2,"卖家取消订单"),CANCELLATION_ORDER_MANAGER(3,"后台人员取消订单"),
		REFUND_SUCCESS(4,"退款成功"),TIME_OUT(5,"订单超时"), UNTO(6,"撤销订单"),RISK_CLOSE(7,"代付关闭");
		private int key;
		private String value;
		
		private OrderDraftStatusEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (OrderDraftStatusEnum en : OrderDraftStatusEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static OrderDraftStatusEnum newInstance(int key) {
			for (OrderDraftStatusEnum en : OrderDraftStatusEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	
	/**
	 * <p>彩票选号方式</p> 
	 *
	 *<pre>
	 *1:单式投注
	 *2:复式投注
	 *3:胆拖投注
	 *</pre>
	 * @author: 李晓勇
	 * @since: 2015年1月13日下午2:58:23
	 * @version: 1.0
	 */
	public enum PollType {

		SINGLE_TYPE(1,"单式投注"),DUPLEX_TYPE(2,"复式投注"),DRAG_COURAGE_TYPE(3,"胆拖投注");
		private PollType(int key, String value) {
			this.key = key;
			this.value = value;
		}
		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (PollType pollType : PollType.values()) {
				if (pollType.key == key) {
					return pollType.value;
				}
			}
			return null;
		}
		
	}

	/**
	 * 
	 * <p>
	 * 真假状态转换
	 * </p>
	 *
	 *<pre>
	 *-1:所有
	 *0:假
	 *1：真
	 *</pre>
	 * @author: 李晓勇
	 * @since: 2015年1月13日上午11:14:40
	 * @version: 1.0
	 */
	public enum BooleanStatus {

		ALL(-1),FALSE(0),TRUE(1);
		
		private BooleanStatus(int value) {
			this.value = value;
		}

		private int value;

		public int getValue() {
			return value;
		}
		
		
		/**
		 * <p>
		 * 初始化枚举BooleanStatus，从外部传入一个value，并生成枚举实例
		 * <p>
		 * 
		 * @param value
		 * @return
		 */
		static public BooleanStatus newInstance(int value) {
			for (BooleanStatus booleanStatus : BooleanStatus.values()) {
				if (booleanStatus.getValue() == value) {
					return booleanStatus;
				}
			}
			return BooleanStatus.FALSE;
		}

		
	}

	/**
	 * <p>
	 * 彩票中奖状态
	 * </p>
	 * 
	 * <pre>
	 * -1:所有
	 * 0:等待开奖
	 * 1：中奖
	 * 2：未中奖
	 * </pre>
	 *
	 * @author: 李晓勇
	 * @since: 2015年1月13日上午10:36:55
	 * @version: 1.0
	 */
	public enum BonusStatus {

		ALL(-1, "所有"),WAIT_OPEN_BONUS(0,"等待开奖"),WIN_BOUNS(1,"中奖"),LOSING_BOUNS(2,"未中奖");
		
		private BonusStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (BonusStatus bonusStatus : BonusStatus.values()) {
				if (bonusStatus.key == key) {
					return bonusStatus.value;
				}
			}
			return null;
		}
		

	}

	/**
	 * 订单来源
	 * <p>订单来源：商城=0，ETM=1，APP=4  </p> 
	 *
	 * @author: 李晓勇
	 * @since: 2015年3月4日上午11:21:17
	 * @version: 1.0
	 */
	public enum OrderFrom{
		MALL(0,"商城"),ETM(1,"ETM"),APP(4,"APP");
		
		private OrderFrom(int key, String value) {
			this.key = key;
			this.value = value;
		}
		
		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (OrderFrom orderFrom : OrderFrom.values()) {
				if (orderFrom.key == key) {
					return orderFrom.value;
				}
			}
			return null;
		}
	}
	/**
	 * 
	 * <p>订单状态</p> 
	 * 
	 * <pre>
	 * 订单状态：所有=-1,待处理=0,已通过审核=1,未通过审核=2,等待备货=3,等待买家确认收货=4,交易关闭=10（系统自动）,客户作废=11,客户拒收=12,异常订单=13,无人签收=14,客户拒收=15, 已签收=16,已完成=17,订单作废=18,处理中=19
	 *</pre>
	 * @author: 邵天元
	 * @since: 2015-1-20下午4:18:01
	 * @version: 1.0
	 */
	public enum OrderStatus {

		ALL(-1, "所有"),
		WAIT_DO(0,"待处理"), APPROVED(1,"已通过审核"),
		CLIENT_SIGN(2,"已签收"), UNDERSIGN(3,"无人签收"),
		WAIT_STOCK(4,"等待备货"),WAIT_RECEIVING(5,"等待买家确认收货"), 
		ORDER_DONE(9,"已完成"),CLOSE_DEAL(10,"交易关闭"), 
		CLIENT_DELETE(11,"客户作废"), CLIENT_REFUSED(12,"客户拒收"), 
		DEBUG_ORDER(13,"异常订单"),ORDER_DRAFT(18,"订单作废"),
		ORDER_DOING(19,"处理中"),UNAPPROVED(20,"未通过审核");
		
		private OrderStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (OrderStatus orderStatus : OrderStatus.values()) {
				if (orderStatus.key == key) {
					return orderStatus.value;
				}
			}
			return null;
		}
	}

	/**
	 * <p>
	 * 支付状态
	 * </p>
	 *
	 *<pre>
	 *-1:所有
	 *0:未支付
	 *1：部分支付
	 *2：已支付
	 *3：部分退款
	 *4：全额退款
	 *5：联合支付
	 *6：支付中
	 *</pre>
	 * @author: 李晓勇
	 * @since: 2015年1月5日上午10:54:51
	 * @version: 1.0
	 */
	public enum PaymentStatus {
		WAIT_PAYMENT(1,"待付款"),YET_PAYMENT(2,"已支付");
		private int key;
		private String value;
		
		private PaymentStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (PaymentStatus en : PaymentStatus.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static PaymentStatus newInstance(int key) {
			for (PaymentStatus en : PaymentStatus.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}

	/**
	 * 
	 * <p>
	 * 订单类型:彩票订单=1，机票订单=2，报刊订单=3，充值订单=4，火车票订单=5，交通违章订单=6，景点门票订单=7，旅游酒店订单=8，汽车票订单=9，就医助手订单=10，幸运大转盘＝11，
	 * 酒店预订＝12，东莞通＝13，信用卡＝14，银行转账＝15，水费订单＝16 ,电费订单＝17，煤气费订单＝18，流量充值＝19，电影票订单＝20，商城订单=31
	 * </p>
	 * @author: 李晓勇
	 * @since: 2015年1月5日上午9:31:18
	 * @version: 1.0
	 */
	public enum OrderTypeEnum {
		
		LOTTERY_ORDER_TYPE(1,"彩票"), AIR_ORDER_TYPE(2, "机票"), 
		PRESS_ORDER_TYPE(3,"报刊"), MOBILE_ORDER_TYPE(4,"手机充值"), TRAIN_ORDER_TYPE(5,"火车票"), 
		TRAFFIC_ORDER_TYPE(6,"违章代缴"), TOURIST_ORDER_TYPE(7,"景点门票"), 
		TOURIST_HOTEL_ORDER_TYPE(8,"旅游酒店"), BUS_ORDER_TYPE(9,"汽车票"), HOSPITAL_ORDER_TYPE(10, "就医助手"), 
		CZP_ORDER_TYPE(11, "幸运大转盘"), HOTEL_ORDER_TYPE(12, "酒店预订"), DGT_ORDER_TYPE(13, "东莞通"), 
		CREDIT_ORDER_TYPE(14, "信用卡还款"), BANK_ORDER_TYPE(15,"银行转账"), WATER_ORDER_TYPE(16,"水费"), 
		ELECTRICITY_ORDER_TYPE(17, "电费"), GAS_ORDER_TYPE(18, "煤气"), FLOW_ORDER_TYPE(19, "流量充值"), 
		MOVIE_ORDER_TYPE(20, "电影票"),BROADBAND(21,"固话宽带充值"),OIL_CARD_TYPE(22, "油卡充值"),
		PAYMENT_COLLECTION_TYPE(23,"代收货款"),COFFEE_ORDER_TYPE(24,"现磨咖啡"),
		/** E-APP年费 */
		E_APP_ANNUAL_FEE_ORDER_TYPE(25,"E-APP年费"),
		/** 商城订单 */
		SHOP_ORDER_TYPE(31,"商城订单");

		private int key;
		private String value;
		
		private OrderTypeEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (OrderTypeEnum en : OrderTypeEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static OrderTypeEnum newInstance(int key) {
			for (OrderTypeEnum en : OrderTypeEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	
	
	/**
	 * 
	 * <p>订单删除标志状态</p>
	 * 
	 * <pre>
	 *0:未删除
	 *1:已删除
	 *</pre>
	 * @author: 邵天元
	 * @since: 2015-1-20下午5:11:46
	 * @version: 1.0
	 */
	public enum DeleteStatus {
		NO(0), YES(1);
		private DeleteStatus(int value) {
			this.value = value;
		}
		private int value;

		public int getValue() {
			return value;
		}
	}
	
	/**
	 * 
	 * <p></p> 
	 * 1 信用订单   2已删除
	 * @author: 郭冬泉
	 * @since: 2015年8月4日下午7:04:36
	 * @version: 1.0
	 */
	public enum CreditStatus {
		CREDIT_ORDER(1), NATIVE_ORDER(2);
		private CreditStatus(int value){
			this.value = value;
		}
		private int value;
		
		public int getValue(){
			return value;
		}
	}
	
	/**
	 * 
	 * <p>订单发货状态</p> 
	 *
	 *<pre>
	 *0：未发货
	 *1：部分发货
	 *2：已发货
	 *</pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-1-20下午5:18:12
	 * @version: 1.0
	 */
	public enum ShippingStatus {
		NOT(0,"未发货"), PART(1,"部分发货"), YES(2,"己发货");
		
		private ShippingStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (ShippingStatus shippingStatus : ShippingStatus.values()) {
				if (shippingStatus.key == key) {
					return shippingStatus.value;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>订单仅退款状态</p> 
	 * 
	 * <pre>
	 * 仅退款状态：退款协议等待商家确认=0,商家不同意协议=1, 商家同意退款=2,商家同意部分退款=3,客服介入=6,退款关闭=7,退款成功=8,商家准备退款=9,买家同意取消退款申请=10
	 * </pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-1-20下午5:24:00
	 * @version: 1.0
	 */
	public enum MoneyStatus {
		WAIT(0,"退款协议等待商家确认"), BUSINESS_NO(1,"商家不同意协议"), BUSINESS_YES(2,"商家同意退款"),BUSINESS_PART(3,"商家同意部分退款"),
		SERVICE(6,"客服介入"),CLOSE(7,"退款关闭"),SUCCESS(8,"退款成功"),PREPARE(9,"商家准备退款"),BUSINESS_CANCLE(10,"买家同意取消退款申请");
		
		private MoneyStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (MoneyStatus moneyStatus : MoneyStatus.values()) {
				if (moneyStatus.key == key) {
					return moneyStatus.value;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>退货退款状态</p> 
	 * 
	 * <pre>
	 * 退货退款状态：退货退款协议等待商家确认=0、商家不同意协议=1、等待买家退货=2、买家已发货等待商家确认=3、商家确认收货拒绝退款=4、商家确认收货准备退款=5、客服介入=6、退货退款关闭=7、退款成功=8、商家准备退款=9、等待买家发货=10、买家同意取消退款退货=11
	 * </pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-1-20下午5:36:51
	 * @version: 1.0
	 */
	public enum GoodsMoneyStatus {
		WAIT_BUSINESS(0,"退货退款协议等待商家确认"), BUSINESS_NO(1,"商家不同意协议"), WAIT_BUYER_REJECTION(2,"等待买家退货"),BUYER_DELIVERY(3,"买家已发货等待商家确认"),BUSINESS_REJECT(4,"商家确认收货拒绝退款"),BUSINESS_REFUND(5,"商家确认收货准备退款"),
		SERVICE(6,"客服介入"),CLOSE(7,"退货退款关闭"),SUCCESS(8,"退款成功"),PREPARE(9,"商家准备退款"),WAIT_BUYER_SHIP(10,"等待买家发货"),CANCEL(11,"买家同意取消退款退货");
		
		private GoodsMoneyStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (MoneyStatus moneyStatus : MoneyStatus.values()) {
				if (moneyStatus.key == key) {
					return moneyStatus.value;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>换货状态</p>
	 *
	 *<pre>
	 *换货状态：换货协议等待商家确认=0、商家不同意协议=1、换货处理中=2、客服介入=6、换货关闭=7、换货成功=8、买家同意取消换货=9、等待买家发货=10
	 *</pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-1-20下午6:01:19
	 * @version: 1.0
	 */
	public enum ChangGoodsStatus {
		WAIT(0,"换货协议等待商家确认"), BUSINESS_NO(1,"商家不同意协议"), EXCHANGES(2,"换货处理中"),
		SERVICE(6,"客服介入"),CLOSE(7,"换货关闭"),SUCCESS(8,"换货成功"),CANCEL(9,"买家同意取消换货"),WAIT_SHIP(10,"等待买家发货");
		
		private ChangGoodsStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (MoneyStatus moneyStatus : MoneyStatus.values()) {
				if (moneyStatus.key == key) {
					return moneyStatus.value;
				}
			}
			return null;
		}
	}
	
	
	/**
	 * 
	 * <p>维修状态</p> 
	 * 
	 * <pre>
	 * 维修状态：维修协议等待商家确认=0、商家不同意协议=1、维修处理中=2、客服介入=6、维修关闭=7、维修成功=8、买家同意取消返修＝9、等待买家发货＝10
	 * </pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-1-20下午7:15:41
	 * @version: 1.0
	 */
	public enum RepairStatus {
		WAIT(0,"维修协议等待商家确认"), BUSINESS_NO(1,"商家不同意协议"), REPAIR(2,"维修处理中"),
		SERVICE(6,"客服介入"),CLOSE(7,"维修关闭"),SUCCESS(8,"维修成功"),CANCEL(9,"买家同意取消返修"),WAIT_SHIP(10,"等待买家发货"),;
		
		private RepairStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (RepairStatus repairStatus : RepairStatus.values()) {
				if (repairStatus.key == key) {
					return repairStatus.value;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>分配状态</p> 
	 * 
	 * <pre>
	 * 待转发=0；已转发=1；驳回=2；回收=3
	 * </pre>
	 * 
	 * @author: 邵天元
	 * @since: 2015-1-20下午7:20:07
	 * @version: 1.0
	 */
	public enum TransforStatus {
		WAIT_TRANSFORM(0,"待转发"), RANSFORM(1,"已转发"), REJECT(2,"驳回"),RETRIEVE(3,"回收");
		private TransforStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (TransforStatus transforStatus : TransforStatus.values()) {
				if (transforStatus.key == key) {
					return transforStatus.value;
				}
			}
			return null;
		}
	}
	
	
	/**
	 * 
	 * <p>订单分类</p> 
	 *	订单分类：一般订单=1，组合套餐=2，团购=3，促销=4，想卖就卖=5，EAPP创业套餐=6，EAPP企业套餐=7
	 * @author: 邵天元
	 * @since: 2015-1-20下午7:33:19
	 * @version: 1.0
	 */
	public enum OrderClassifyEnum {
		GENERAL(1,"一般订单"),ASSEMBLE(2,"组合套餐"),CUSTOMERS(3,"团购"),PROMOTION(4,"促销"),WANT_SELL_SELL(5,"想卖就卖"),
		E_APP_SYB(6,"EAPP创业套餐"),E_APP_PHY(7,"EAPP企业套餐");
		private int key;
		private String value;
		
		private OrderClassifyEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (OrderClassifyEnum en : OrderClassifyEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static OrderClassifyEnum newInstance(int key) {
			for (OrderClassifyEnum en : OrderClassifyEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>实体商品标志</p>
	 * 
	 * <pre>
	 * 1:实体商品
	 * 0:虚拟商品
	 * </pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-1-20下午7:37:49
	 * @version: 1.0
	 */
	public enum ItemType {
		ENTITY(1),VIRTUAL(0);
		private ItemType(int value) {
			this.value = value;
		}
		private int value;

		public int getValue() {
			return value;
		}
	}
	
	/**
	 * 
	 * <p>订单评价状态</p>
	 * 
	 * <pre>
	 *-1:订单交易完成但没评价
	 *0:买家已评价
	 *1:双方已评价
	 *-8:无
	 *</pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-1-20下午7:40:21
	 * @version: 1.0
	 */
	public enum OrderComment {
		NO_APPRAISE(-1),BUYER_APPRAISE(0),BOTH_APPRAISE(1),NOT(-8);
		private OrderComment(int value) {
			this.value = value;
		}
		private int value;

		public int getValue() {
			return value;
		}
	}
	
	/**
	 * 
	 * <p>分润标志</p>
	 * 
	 * <pre>
	 * 0:未分
	 * 1：待分
	 * 2：已分
	 * </pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-1-20下午7:44:28
	 * @version: 1.0
	 */
	public enum AllocationStatus {
		NOT(0),WAIT(0),YES(1);
		private AllocationStatus(int value) {
			this.value = value;
		}
		private int value;

		public int getValue() {
			return value;
		}
	}
	
	/**
	 * 
	 * <p>订单查询状态</p> 
	 * 
	 * <pre>
	 * -1:所有
	 * 1:待付款
	 * 2:待发货
	 * 3:待收货
	 * 4:已完成
	 * 5:退款中
	 * 6:已退款
	 * 7:已取消
	 * </pre>
	 *
	 * @author: 邵天元
	 * @since: 2015-3-5下午1:45:06
	 * @version: 1.0
	 */
	public enum QueryOrderStatus{
		ALL(-1,""),WAIT_PAY(1,"待付款"),WAIT_SHOPPING(2,"待发货"),WAIT_ACCEPT(3,"待收货"),DONE(4,"已完成"),TRAD(5,"退款中"),TRAD_DONE(6,"已退款"),CHANCLE(7,"已取消");
		
		private QueryOrderStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		private int key;
		private String value;
		
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		 public static String getValueByKey(int key) {
			for (QueryOrderStatus qStatus : QueryOrderStatus.values()) {
				if (qStatus.key == key) {
					return qStatus.value;
				}
			}
			return null;
		}
		/**
		 * 
		 * <p>通过key获取订单查询状态对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static QueryOrderStatus newInstance(int key) {
			for (QueryOrderStatus qStatus : QueryOrderStatus.values()) {
				if (qStatus.getKey() == key) {
					return qStatus;
				}
			}
			return QueryOrderStatus.ALL;
		}
	}
	
	/**
	 * 
	 * <p>商户申请代收类型审核状态</p> 
	 * @author: liangrong
	 * @since: 2015年8月6日下午8:45:14
	 * @version: 1.0
	 */
	public enum CollectionTypesStatus{
		ALL(-1,""),WAIT_AUDIT(1,"审批中"),AUDIT_DONE(2,"审批通过"),NOT_AUDIT(3,"审批不通过"),CANCLE(4,"已取消申请"),DISABLED(5,"取消资格"),DELETE(6,"已删除");
		private int key;
		private String value;
		
		private CollectionTypesStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (CollectionTypesStatus en : CollectionTypesStatus.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static CollectionTypesStatus newInstance(int key) {
			for (CollectionTypesStatus en : CollectionTypesStatus.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	/**
	 * 
	 * <p>代收货款订单退款状态</p> 
	 * 
	 * 1 无退款，2 申请退款中，3 退款成功，4 退款失败，5 取消退款
	 * 
	 * @author: liangrong
	 * @since: 2015年8月14日下午3:45:14
	 * @version: 1.0
	 */
	public enum CollectionRefundStatus{
		ALL(-1,""),NO_REFUND(1,"无退款"),REFUND_DOING(2,"申请退款中"),REFUND_DONE(3,"退款成功"),REFND_FAIL(4,"退款失败"),CANCLE_REFUND(5,"取消退款");
		private int key;
		private String value;
		
		private CollectionRefundStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (CollectionRefundStatus en : CollectionRefundStatus.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static CollectionRefundStatus newInstance(int key) {
			for (CollectionRefundStatus en : CollectionRefundStatus.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	
	/**
	 * 
	 * <p>人工代办违章订单处理状态</p> 
	 * 
	 * 1 待处理，2 已申请代办，3 代办成功，4 代办失败
	 * 
	 * @author: liangrong
	 * @since: 2015年8月14日下午3:45:14
	 * @version: 1.0
	 */
	public enum TrafficHandleStatus{
		ALL(-1,""),WAIT_HANDLE(1,"待处理"),HANDLE_DOING(2,"已申请代办"),HANDLE_DONE(3,"代办成功"),HANDLE_FAIL(4,"代办失败"),REFUND_DONE(5,"已退款");
		private int key;
		private String value;
		
		private TrafficHandleStatus(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (TrafficHandleStatus en : TrafficHandleStatus.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static TrafficHandleStatus newInstance(int key) {
			for (TrafficHandleStatus en : TrafficHandleStatus.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
	
	
	
	
	/**
	 * 懒人购频道
	 * <p>生活超市=00001，易通批发=00002，9块9包邮=00003，大商城=00004，行业合作=00005  </p> 
	 *
	 * @author:吴乙昭
	 * @since: 2015年9月8日上午11:21:17
	 * @version: 1.0
	 */
	public enum LazyShopType{
		EVERYDAYSHOP(1,"00001"),WHOLESALE(2,"00002"),NINEFREE(3,"00003"),BIGSHOP(4,"00004"),COOPERATESHOP(5,"00005");
		private LazyShopType(int key, String value) {
			this.key = key;
			this.value = value;
		}
		private int key;
		private String value;
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (OrderFrom orderFrom : OrderFrom.values()) {
				if (orderFrom.key == key) {
					return orderFrom.value;
				}
			}
			return null;
		}
	}
	
	/**
	 * 车辆类型
	 *
	 * @author:liangrong
	 * @since: 2015年10月27日上午11:21:17
	 * @version: 1.0
	 */
	public enum CarType{
		GIB(1,"大型汽车"),SMALL(2,"小型汽车"),EMBASSY(3,"使馆汽车"),CONSULATE(4,"领馆汽车"),OVERSEAS(5,"境外汽车"),FOREIGN(6,"外籍汽车"),MOTORCYCLE(7,"两、三轮摩托车"),
		TRAILER(15,"挂车"),COACHES(16,"境外汽车"),TEMPENTRY(20,"临时入境汽车"),TEMPMOTOR(21,"临时入境摩托车"),TEMPDRIVING(22,"临时行驶汽车"),POLICE(23,"公安警车"),
		HKCAR(26,"香港出入境车辆"),AMCAR(27,"澳门出入境车辆"),OTHER(99,"其它");
		private int key;
		private String value;
		
		private CarType(int key, String value) {
			this.key = key;
			this.value = value;
		}
		
		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param status
		 * @return
		 */
		static public String getValueByKey(int key) {
			for (CarType carType : CarType.values()) {
				if (carType.key == key) {
					return carType.value;
				}
			}
			return null;
		}
	}
	
	/**
	 * <p>已付款待发货=2</p>
	 *  已付款待发货=2：
	 *  	1.处理中
	 *      2.处理失败
	 *      3.冲正失败
	 *      4.便民已发货
	 * @author: 谭锡标
	 * @since: 2016年6月14日下午3:56:35
	 * @version: 1.0
	 */
	public enum OrderPaidToShipStatusEnum{
		DEALING(1,"处理中"),DEALING_FAIL(2,"处理失败"),FLUSH_FAIL(3,"冲正失败");
		private int key;
		private String value;
		
		private OrderPaidToShipStatusEnum(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		/**
		 * <p>
		 * 通过值获取名称
		 * </p>
		 * 
		 * @param key
		 * @return
		 */
		public static String getValueByKey(int key) {
			for (OrderPaidToShipStatusEnum en : OrderPaidToShipStatusEnum.values()) {
				if (en.key == key) {
					return en.value;
				}
			}
			return null;
		}
		
		/** 
		 * <p>通过key获取类型对象</p> 
		 * @param key
		 * @return 
		 * @throws
		 */
		public static OrderPaidToShipStatusEnum newInstance(int key) {
			for (OrderPaidToShipStatusEnum en : OrderPaidToShipStatusEnum.values()) {
				if (en.getKey() == key) {
					return en;
				}
			}
			return null;
		}
	}
}
