import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class class447 implements class459 {
    JSONObject field4708;

    public class447(JSONObject var1) {
        this.field4708 = var1;
    }

    public class447(String var1) throws UnsupportedEncodingException {
        this.method7846(var1);
    }

    public class447(byte[] var1) throws UnsupportedEncodingException {
        this.method7845(var1);
    }

    public class461 method8032() {
        return class461.field4764;
    }

    void method7845(byte[] var1) throws UnsupportedEncodingException {
        String var3 = new String(var1, StandardCharsets.UTF_8);
        this.method7846(var3);
    }

    void method7846(String var1) throws UnsupportedEncodingException {
        try {
            if (var1.charAt(0) == '{') {
                this.field4708 = new JSONObject(var1);
            } else {
                if (var1.charAt(0) != '[') {
                    throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
                }

                JSONArray var3 = new JSONArray(var1);
                this.field4708 = new JSONObject();
                this.field4708.put("arrayValues", var3);
            }

        } catch (JSONException var4) {
            throw new UnsupportedEncodingException(var4.getMessage());
        }
    }

    public JSONObject method7848() {
        return this.field4708;
    }

    public byte[] method8031() throws UnsupportedEncodingException {
        return this.field4708 == null ? new byte[0] : this.field4708.toString().getBytes(StandardCharsets.UTF_8);
    }
}
