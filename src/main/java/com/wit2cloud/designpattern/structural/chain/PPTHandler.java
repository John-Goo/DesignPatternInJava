package com.wit2cloud.designpattern.structural.chain;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: PPTHandler
 * @Desc: TODO
 * @history v1.0
 */
public class PPTHandler implements Handler{

    private Handler handler;

    private String handlerName;

    public PPTHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("ppt")){
            System.out.println("处理和保存ppt文件："+handlerName);
        }else if(handler !=null){
            System.out.println(handlerName+"传递给 -->"+handler.getHandlerName()+"进行处理");
            // 传递下一个handler处理
            handler.process(file);
        }else {
            System.out.println("File not supported !");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
