package com.qf.inter2;

/**
 * ����ӿ�
 */
public interface Board extends USB,SD,RJ45,HDMI{
	void light();
	void dissipateHeat();
}
