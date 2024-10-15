package Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("JAVA"));
        assertFalse(CryptoManager.isStringInBounds("java"));
	}

	@Test
	void testCaesarEncryption() {
		assertEquals("DEF", CryptoManager.caesarEncryption("ABC", 3));
	}

	@Test
	void testBellasoEncryption() {
		assertEquals("ENCRYPTED_TEXT", CryptoManager.bellasoEncryption("PLAIN_TEXT", "KEY"));
	}

	@Test
	void testCaesarDecryption() {
		assertEquals("ABC", CryptoManager.caesarDecryption("DEF", 3));
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("PLAIN_TEXT", CryptoManager.bellasoDecryption("ENCRYPTED_TEXT", "KEY"));
	}

}
