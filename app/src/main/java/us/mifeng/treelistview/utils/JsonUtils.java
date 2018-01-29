package us.mifeng.treelistview.utils;

import com.google.gson.Gson;

import us.mifeng.treelistview.bean.JsonBean;
import us.mifeng.treelistview.bean.TestBean;

/**
 * Created by 黑夜之火 on 2018/1/23.
 */

public class JsonUtils {
    public static JsonBean jsonResult(String str){
        JsonBean jsonBean = new Gson().fromJson(str, JsonBean.class);
        return jsonBean;
    }
    public static TestBean spinnerJsonResult(String str){
        TestBean testBean = new Gson().fromJson(str, TestBean.class);
        return testBean;
    }
}
