package com.binfoo.www.improve.com;

/**
 * Created by binfoo on 2017/8/30.
 */
public abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();

}

class Test{
    public void test(Bird bird){
        System.out.println(bird.getName()+ "能夠飛"+ bird.fly() + "米");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test(new Bird() {
            @Override
            public int fly() {
                return 1000;
            }

            @Override
            public String getName() {
                return "大雁";
            }
        });
    }
}