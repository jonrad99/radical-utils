package uk.co.radfordconsultancy.util.security.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import uk.co.radfordconsultancy.util.security.PasswordUtils;
import uk.co.radfordconsultancy.util.security.PasswordUtils.PasswordStrength;

public class PasswordUtilsTest {
	
	@Test
	public void testGenerateLowStrengthPassword6() {
		int length = 6;
		String password = PasswordUtils.generatePassword(PasswordStrength.LOW, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertSame("Password not lowercase", password.toLowerCase(), password);
	    assertTrue("Password not letters only", StringUtils.isAlpha(password));
	}

	@Test
	public void testGenerateLowStrengthPassword7() {
		int length = 7;
		String password = PasswordUtils.generatePassword(PasswordStrength.LOW, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertSame("Password not lowercase", password.toLowerCase(), password);
	    assertTrue("Password not letters only", StringUtils.isAlpha(password));
	}
	
	@Test
	public void testGenerateLowStrengthPassword8() {
		int length = 8;
		String password = PasswordUtils.generatePassword(PasswordStrength.LOW, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertSame("Password not lowercase", password.toLowerCase(), password);
	    assertTrue("Password not letters only", StringUtils.isAlpha(password));
	}

	@Test
	public void testGenerateLowStrengthPassword9() {
		int length = 9;
		String password = PasswordUtils.generatePassword(PasswordStrength.LOW, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertSame("Password not lowercase", password.toLowerCase(), password);
	    assertTrue("Password not letters only", StringUtils.isAlpha(password));
	}

	@Test
	public void testGenerateLowStrengthPassword10() {
		int length = 10;
		String password = PasswordUtils.generatePassword(PasswordStrength.LOW, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertSame("Password not lowercase", password.toLowerCase(), password);
	    assertTrue("Password not letters only", StringUtils.isAlpha(password));
	}

	@Test
	public void testGenerateLowStrengthPassword11() {
		int length = 11;
		String password = PasswordUtils.generatePassword(PasswordStrength.LOW, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertSame("Password not lowercase", password.toLowerCase(), password);
	    assertTrue("Password not letters only", StringUtils.isAlpha(password));
	}

	@Test
	public void testGenerateLowStrengthPassword12() {
		int length = 12;
		String password = PasswordUtils.generatePassword(PasswordStrength.LOW, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertSame("Password not lowercase", password.toLowerCase(), password);
	    assertTrue("Password not letters only", StringUtils.isAlpha(password));
	}

	@Test
	public void testGenerateMediumStrengthPassword6() {
		int length = 6;
		String password = PasswordUtils.generatePassword(PasswordStrength.MEDIUM, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password not letters/digits only", StringUtils.isAlphanumeric(password));
	}
	
	@Test
	public void testGenerateMediumStrengthPassword7() {
		int length = 7;
		String password = PasswordUtils.generatePassword(PasswordStrength.MEDIUM, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateMediumStrengthPassword8() {
		int length = 8;
		String password = PasswordUtils.generatePassword(PasswordStrength.MEDIUM, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateMediumStrengthPassword9() {
		int length = 9;
		String password = PasswordUtils.generatePassword(PasswordStrength.MEDIUM, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateMediumStrengthPassword10() {
		int length = 10;
		String password = PasswordUtils.generatePassword(PasswordStrength.MEDIUM, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password not letters/digits only", StringUtils.isAlphanumeric(password));
	}
	
	@Test
	public void testGenerateMediumStrengthPassword11() {
		int length = 11;
		String password = PasswordUtils.generatePassword(PasswordStrength.MEDIUM, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateMediumStrengthPassword12() {
		int length = 12;
		String password = PasswordUtils.generatePassword(PasswordStrength.MEDIUM, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateHighStrengthPassword6() {
		int length = 6;
		String password = PasswordUtils.generatePassword(PasswordStrength.HIGH, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password is not letters/digits only", StringUtils.isAlphanumeric(password));
	}
	
	@Test
	public void testGenerateHighStrengthPassword7() {
		int length = 7;
		String password = PasswordUtils.generatePassword(PasswordStrength.HIGH, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password is not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateHighStrengthPassword8() {
		int length = 8;
		String password = PasswordUtils.generatePassword(PasswordStrength.HIGH, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password is not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateHighStrengthPassword9() {
		int length = 9;
		String password = PasswordUtils.generatePassword(PasswordStrength.HIGH, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password is not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateHighStrengthPassword10() {
		int length = 10;
		String password = PasswordUtils.generatePassword(PasswordStrength.HIGH, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password is not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateHighStrengthPassword11() {
		int length = 11;
		String password = PasswordUtils.generatePassword(PasswordStrength.HIGH, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password is not letters/digits only", StringUtils.isAlphanumeric(password));
	}

	@Test
	public void testGenerateHighStrengthPassword12() {
		int length = 12;
		String password = PasswordUtils.generatePassword(PasswordStrength.HIGH, length);
	    assertTrue("Password is null", password != null);
	    assertEquals("Password not correct length", length, password.length());
	    assertNotSame("Password not mixed case", password.toLowerCase(), password);
	    assertFalse("Password is letters only", StringUtils.isAlpha(password));
	    assertTrue("Password is not letters/digits only", StringUtils.isAlphanumeric(password));
	}
}
