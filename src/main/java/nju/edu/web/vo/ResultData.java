package nju.edu.web.vo;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import nju.edu.util.ResponseCode;

/**
 * Created by sunshine on 4/8/16.
 */
public class ResultData {
    private ResponseCode responseCode;
    private Object data;
    private String description;

    public ResultData() {
        this.responseCode = ResponseCode.RESPONSE_OK;
        this.description = "成功";
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
        if(responseCode==ResponseCode.RESPONSE_NULL) {
            this.description = "失败";
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }
}

