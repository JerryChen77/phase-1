package com.qf.time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Demo05 {
	public static void main(String[] args) {
		// Ψһ��ʱ���--׼
		Instant instant = Instant.now();
		System.out.println(instant);
		
		Instant now = Instant.now(Clock.system(ZoneId.systemDefault()));
		System.out.println(now);
		
		Instant instant2 = Instant.ofEpochMilli(System.currentTimeMillis());
		System.out.println(instant2);
		
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for (String zoneId : zoneIds) {
			System.out.println(zoneId);
		}
		
		Instant instant3 = Instant.now(Clock.system(ZoneId.of("Asia/Shanghai")));
		System.out.println(instant3);
		
		// ����˲����ʱ�����ϣ�����һ�� ZonedDateTime �� 
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		System.out.println(zone);
		
	}
}
