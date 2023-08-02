import java.math.BigInteger;

public class RSA {
    static final BigInteger PUBLIC_MODULUS = new BigInteger(ClientLauncher.RSA_MODULUS, 16);
    static final BigInteger PUBLIC_EXPONENT = new BigInteger("10001", 16);

    RSA() throws Throwable {
    }
}
