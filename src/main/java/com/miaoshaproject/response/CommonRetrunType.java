package com.miaoshaproject.response;

public class CommonRetrunType {
    //表明对应请求的返回处理结果 “success” 或 “fail”
    private String status;

    //若status=success,则data内返回前段需要的json数据
    //若status=fail,则data内使用通用的错误码格式
    private Object data;

    //定义一个通用得到创建方法
    public static CommonRetrunType create(Object result){
        return CommonRetrunType.create(result,"success");
    }

    public static CommonRetrunType create(Object result, String status) {
        CommonRetrunType type = new CommonRetrunType();
        type.setData(result);
        type.setStatus(status);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
