package com.wuhui.springboot.section.annotation;

/**
 * Created by Administrator on 2016/11/4.
 */
public enum LogType {

    ControLog{
        @Override
        public String MaskText(String str) {
            return "controLog :" + str;
        }
    },
    ServiceLog{
        @Override
        public String MaskText(String str) {
            return "serviceLog :" + str;
        }
    };

    public abstract  String MaskText(String str);
}
