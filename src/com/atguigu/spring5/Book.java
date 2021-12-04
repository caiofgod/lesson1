package com.atguigu.spring5;

public class Book {
    private  String bname;
    private String bauther;

    public void setBauther(String bauther) {
        this.bauther = bauther;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public  void testDemo() {
        System.out.println(bname);
        System.out.println(bauther);
    }
}
