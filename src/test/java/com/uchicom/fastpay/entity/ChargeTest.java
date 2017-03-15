// (c) 2017 uchicom
package com.uchicom.fastpay.entity;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class ChargeTest {

	@Test
	public void test() {
		try {
			String check = "{\"id\":\"ch_94717012800030835\",\"object\":\"charge\",\"livemode\":false,"
					+ "\"currency\":\"jpy\",\"description\":null,\"amount\":1058,\"amount_refunded\":0,"
					+ "\"created\":1485577287,\"paid\":true,\"refunded\":false,\"failure_code\":null,"
					+ "\"failure_message\":null,\"card\":{\"id\":\"card_3rIfURddExJ6TeVJ4coYZQbo\","
					+ "\"object\":\"card\",\"last4\":\"1234\",\"type\":\"JCB\",\"exp_month\":1,"
					+ "\"exp_year\":2020},\"captured\":true,\"refunds\":[],\"customer\":null}";
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
			Charge charge = mapper.readValue(check, Charge.class);
			Assert.assertNotNull(charge);
			Assert.assertEquals("ch_94717012800030835", charge.getFastpayId());
			Assert.assertEquals("charge", charge.getObject());
			Assert.assertFalse(charge.isLivemode());
			Assert.assertEquals("jpy", charge.getCurrency());
			Assert.assertNull( charge.getDescription());
			Assert.assertEquals(Integer.valueOf(1058), charge.getAmount());
			Assert.assertEquals(Integer.valueOf(0), charge.getAmountRefunded());
			Assert.assertTrue(charge.isPaid());
			Assert.assertFalse(charge.isRefunded());
			Assert.assertNull( charge.getFailureCode());
			Assert.assertNull( charge.getFailureMessage());
			Assert.assertEquals(1485577287000L, charge.getCreated().getTime());
			Assert.assertNotNull(charge.getCard());
			Card card = charge.getCard();
			Assert.assertEquals("card_3rIfURddExJ6TeVJ4coYZQbo", card.getFastpayId());
			Assert.assertEquals("card", card.getObject());
			Assert.assertEquals("1234", card.getLast4());
			Assert.assertEquals("JCB", card.getType());
			Assert.assertEquals(1, card.getExpMonth());
			Assert.assertEquals(2020, card.getExpYear());
			Assert.assertTrue(charge.isCaptured());
			Assert.assertTrue(charge.getRefunds().length == 0);
			Assert.assertNull(charge.getCustomer());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
