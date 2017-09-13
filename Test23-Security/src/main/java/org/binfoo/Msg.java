package org.binfoo;

/**
 * Created by ZhangHongbin on 2017/9/13.
 */
public class Msg {
    private String title;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String extraInfo;


    public Msg(){

    }

    public Msg(String title,String content,String extraInfo){
        this.title = title;
        this.content = content;
        this.extraInfo = extraInfo;
    }

}
