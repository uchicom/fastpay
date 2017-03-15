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
 * 新規決済、確定、払い戻し、再オーソリキャンセル
 *
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class EventTest {

	/**
	 * 新規決済
	 */
	@Test
	public void chargeSucceeded() {
		try {
			String check = "{\"object\":\"event\",\"id\":\"evt_P96I40QBUIKOKuxiOWlAjdTx\",\"created\":1489046525,\"livemode\":false,\"type\":\"charge_succeeded\",\"data\":{\"object\":\"charge\",\"charge\":{\"id\":\"ch_14817030969585798\",\"created\":1489046525,\"object\":\"charge\"}}}";
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

	/**
	 * 確定
	 * 未作成
	 */
	@Test
	public void captureSucceeded() {
		try {
			String check = "{\"object\":\"event\",\"id\":\"evt_tFkqpDQ6zxLVjldcULuqt2rv\",\"created\":1489046584,\"livemode\":false,\"type\":\"capture_succeeded\",\"data\":{\"object\":\"capture\",\"capture\":{\"id\":\"ch_14817030969585798\",\"created\":1489046584,\"object\":\"capture\"}}}";
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
	/**
	 * 払い戻し
	 * 未作成
	 */
	@Test
	public void refundSucceeded() {
		try {
			String check = "";
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
	/**
	 * 再オーソリキャンセル
	 * 未作成
	 */
	@Test
	public void systemRefundSucceeded() {
		try {
			String check = "";
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
