package com.test.model.wallet;

import com.test.model.abstraction.ModelAbstraction;

//�û�ÿ��ѯһ�Σ�����һ��
public class Wallet extends ModelAbstraction {

	// �û���ID
	private String userId;

	// �����������֧��
	private double taskPay;
	// ����������Ĳ��
	private double taskDiff;

	// ������
	private double taskUserAll;
	// ����������
	private double taskUserDoing;
	// ���������
	private double taskUserToCheck;
	// ����������,������
	private double taskUserChecked;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getTaskPay() {
		return taskPay;
	}

	public void setTaskPay(double taskPay) {
		this.taskPay = taskPay;
	}

	public double getTaskDiff() {
		return taskDiff;
	}

	public void setTaskDiff(double taskDiff) {
		this.taskDiff = taskDiff;
	}

	public double getTaskUserAll() {
		return taskUserAll;
	}

	public void setTaskUserAll(double taskUserAll) {
		this.taskUserAll = taskUserAll;
	}

	public double getTaskUserDoing() {
		return taskUserDoing;
	}

	public void setTaskUserDoing(double taskUserDoing) {
		this.taskUserDoing = taskUserDoing;
	}

	public double getTaskUserToCheck() {
		return taskUserToCheck;
	}

	public void setTaskUserToCheck(double taskUserToCheck) {
		this.taskUserToCheck = taskUserToCheck;
	}

	public double getTaskUserChecked() {
		return taskUserChecked;
	}

	public void setTaskUserChecked(double taskUserChecked) {
		this.taskUserChecked = taskUserChecked;
	}

}
