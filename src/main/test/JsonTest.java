import com.alibaba.fastjson.JSONObject;
import model.*;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by iss on 17/12/24.
 */
public class JsonTest {

    @Test
    public void test() throws IllegalAccessException {

        //短信登录
//        SmsLoginDto dto = new SmsLoginDto();
        //账号登录
//        PasswdLoginDto dto = new PasswdLoginDto();
        //注册
        RegistDto dto = new RegistDto();
        //设置密码
//        ResetPasswdDto dto = new ResetPasswdDto();
        //发短信
//        SendSmsCodeDto dto = new SendSmsCodeDto();

        Field[] fields = dto.getClass().getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            Class clazz = field.getType();
            if(clazz.getName().contains("Boolean")){
                field.set(dto,true);
            }
            if(clazz.getName().contains("String")){
                field.set(dto,"9999");
            }
            if(clazz.getName().contains("Integer")){
                field.set(dto,0);
            }
            if(clazz.getName().contains("Float")){
                field.set(dto,5.9f);
            }
        }

        System.out.println(JSONObject.toJSONString(dto));
        System.out.println();

    }


    @Test
    public void testRes() throws IllegalAccessException {
        //登录response
//        LoginResponseDto dto = new LoginResponseDto();
//        Response<LoginResponseDto> response =new Response<LoginResponseDto>();

        //注册response
//        RegistResponseDto dto = new RegistResponseDto();

        //订单列表response
        OrderResponse dto = new OrderResponse();
        Response<OrderResponse> response =new Response<OrderResponse>();

        Field[] fields = dto.getClass().getDeclaredFields();
        for(Field field:fields){

            Class clazz = field.getType();
            field.setAccessible(true);

            if(clazz.getName().contains("Boolean")){
                field.set(dto,true);
            }
            if(clazz.getName().contains("String")){
                field.set(dto,"9999");
            }
            if(clazz.getName().contains("Integer") ||clazz.getName().contains("int")){
                field.set(dto,0);
            }
            if(clazz.getName().contains("Float")){
                field.set(dto,5.9f);
            }

            if(clazz.getName().contains("Long") ||clazz.getName().contains("long")){
                field.set(dto,0);
            }
        }

        response.setCode(200);
        response.setData(dto);
        response.setMessage("success");
        System.out.println(JSONObject.toJSONString(response));
    }
}
