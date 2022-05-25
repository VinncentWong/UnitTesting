import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {
    
    String expectedResponse = "{\"id\" : 1, \"name\" : \"Item A\", \"stock\" : 20}";

    @Test
    public void jsonTest() throws JSONException{
        String actualResponse = "{\"id\" : 1, \"name\" : \"Item A\", \"stock\" : 20}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, true);
    }

    @Test
    public void jsonTestWithStrictFalse() throws JSONException{
        String actualResponse =  "{id:1, name: \"Item A\", stock: 20}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }
}
