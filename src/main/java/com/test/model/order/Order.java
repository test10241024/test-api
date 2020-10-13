package com.test.model.order;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.test.model.abstraction.ModelAbstraction;

public class Order extends ModelAbstraction {

	// �û���Ϣ
	private String userId;
	private String userName;
	private String userPhone;
	//������Ϣ
	private String taskId;
	private String taskName;
	// ������Ϣ
	private Map<Integer, String> payStatusMap; // �����������ж���
	private int payStatus;
	private String payStatusStr;

	// ���
	private BigDecimal totalFee;
	// ʵ��֧��
	private BigDecimal amountPay;
	// ΢��Ԥ����֧��ID
	private String prepayId;

	// �˴���Ҫ����!!
	public Order() {
		payStatusMap = new HashMap<Integer, String>();
		payStatusMap.put(1, "�½�����");
		payStatusMap.put(2, "Ԥ��������(΢��֧��)");
		payStatusMap.put(3, "֧���ɹ�(΢��֧��)");
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Map<Integer, String> getPayStatusMap() {
		return payStatusMap;
	}

	public void setPayStatusMap(Map<Integer, String> payStatusMap) {
		this.payStatusMap = payStatusMap;
	}

	public int getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayStatusStr() {
		return payStatusStr;
	}

	public void setPayStatusStr(String payStatusStr) {
		this.payStatusStr = payStatusStr;
	}

	public BigDecimal getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	public BigDecimal getAmountPay() {
		return amountPay;
	}

	public void setAmountPay(BigDecimal amountPay) {
		this.amountPay = amountPay;
	}

	public String getPrepayId() {
		return prepayId;
	}

	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

}
