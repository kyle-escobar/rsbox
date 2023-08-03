import java.math.BigInteger;

public class LoginEncryption {
   static final BigInteger rsaModulus = new BigInteger(ClientLauncher.INSTANCE.getRSA_MODULUS(), 16);
   static final BigInteger rsaExponent = new BigInteger("10001", 16);

   LoginEncryption() throws Throwable {
   }
}
