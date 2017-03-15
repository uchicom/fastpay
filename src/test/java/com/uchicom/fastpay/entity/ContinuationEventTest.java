// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * WebhookのJson
 * 継続課金
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class ContinuationEventTest {

	/** 継続課金 */
	@Test
	public void subscriptionChargeSucceeded() {
		try {
			String check = "{\"object\":\"event\",\"id\":\"evt_dLvzq0muGYE5sjAlCwy0PWmz\","
					+ "\"created\":1489036992,\"livemode\":false,"
					+ "\"type\":\"subscription_charge_succeeded\","
					+ "\"data\":{\"object\":{\"object\":\"subscription_charge\","
					+ "\"subscription\":\"subs_yulQv0lBT13HvCtaLi2I7PIT\","
					+ "\"period_start\":1488985200,\"period_end\":1491663599,"
					+ "\"charge\":{\"id\":\"ch_15717030969582373\",\"created\":1489036992,"
					+ "\"object\":\"charge\"}}}}";
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
			ContinuationEvent event = mapper.readValue(check, ContinuationEvent.class);
			Assert.assertNotNull(event);
			Assert.assertEquals("event", event.getObject());
			Assert.assertEquals("evt_dLvzq0muGYE5sjAlCwy0PWmz", event.getFastpayId());
			Assert.assertEquals(new Date(1489036992000L), event.getCreated());
			Assert.assertFalse(event.isLivemode());
			Assert.assertEquals("subscription_charge_succeeded", event.getType());
			Assert.assertNotNull(event.getData());
			SubscriptionCharge subscriptionCharge = event.getData().getSubscriptionCharge();
			Assert.assertEquals("subscription_charge", subscriptionCharge.getObject());
			Assert.assertEquals("subs_yulQv0lBT13HvCtaLi2I7PIT", subscriptionCharge.getFastpayId());
			Assert.assertEquals(new Date(1488985200000L), subscriptionCharge.getPeriodStart());
			Assert.assertEquals(new Date(1491663599000L), subscriptionCharge.getPeriodEnd());
			Charge charge = subscriptionCharge.getCharge();
			Assert.assertNotNull(charge);
			Assert.assertEquals("ch_15717030969582373", charge.getFastpayId());
			Assert.assertEquals(new Date(1489036992000L), charge.getCreated());
			Assert.assertEquals("charge", charge.getObject());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
