// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class SubscriptionTest {

	@Test
	public void test() {
		try {
			String check = "{\"id\":\"subs_uYhFpMW9UnZf62ZPNQ7kLG0j\","
					+ "\"object\":\"subscription\",\"display_id\":\"6C7UOYN35SSDP6L4NZBW3BT4OM\","
					+ "\"status\":\"active\",\"suspended_date\":null,"
					+ "\"activation_date\":1486225759,\"created\":1486225755,"
					+ "\"plan\":{\"id\":\"plan_8I8stGgDIyTIyuurQhzcFMj1\","
					+ "\"object\":\"plan\",\"livemode\":false,"
					+ "\"name\":\"\u30a8\u30f3\u30c8\u30ea\u30fc\","
					+ "\"interval\":\"month\",\"interval_count\":1,"
					+ "\"trial_count\":0,\"amount\":500},"
					+ "\"customer\":null}";
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
			Subscription subscription = mapper.readValue(check, Subscription.class);
			Assert.assertNotNull(subscription);
			Assert.assertEquals("subs_uYhFpMW9UnZf62ZPNQ7kLG0j", subscription.getFastpayId());
			Assert.assertEquals("subscription", subscription.getObject());
			Assert.assertEquals("6C7UOYN35SSDP6L4NZBW3BT4OM", subscription.getDisplayId());
			Assert.assertEquals("active", subscription.getStatus());
			Assert.assertNull(subscription.getSuspendedDate());
			Assert.assertEquals(new Date(1486225759000L), subscription.getActivationDate());
			Assert.assertEquals(new Date(1486225755000L), subscription.getCreated());
			Assert.assertNotNull(subscription.getPlan());
			Plan plan = subscription.getPlan();
			Assert.assertEquals("plan_8I8stGgDIyTIyuurQhzcFMj1", plan.getFastpayId());
			Assert.assertEquals("plan", plan.getObject());
			Assert.assertFalse(plan.isLivemode());
			Assert.assertEquals("\u30a8\u30f3\u30c8\u30ea\u30fc", plan.getName());
			Assert.assertEquals("month", plan.getPlanInterval());
			Assert.assertEquals(1, plan.getIntervalCount());
			Assert.assertEquals(0, plan.getTrialCount());
			Assert.assertEquals(500, plan.getAmount());
			Assert.assertNull(subscription.getCustomer());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
