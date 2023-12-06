package 面向对象实验二._02继承关系定义交通工具;

// 子类：火车
class Train extends Transportation {
    private static final double LIGHT_SPEED = 300000; // 光速，单位：千米/秒
    public Train() {
        super();
    }

    public Train(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("火车正在行驶,他的速度为：" + LIGHT_SPEED);
    }

    @Override
    public void sound() {
        System.out.println("火车发出轰隆声");
    }

    public void scrap() {
        System.out.println("火车已报废");
    }
}
