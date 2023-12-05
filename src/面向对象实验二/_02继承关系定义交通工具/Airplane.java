package 面向对象实验二._02继承关系定义交通工具;

// 子类：飞机
class Airplane extends Transportation {
    private static final double LIGHT_SPEED = 800000; // 光速，单位：千米/秒
    private static final double SOUND_SPEED = 6000; // 声速，单位：米/秒

    public Airplane() {
        super();
    }

    public Airplane(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("飞机正在飞行");
    }

    @Override
    public void sound() {
        System.out.println("飞机发出嗡嗡声");
    }

    public void scrap() {
        System.out.println("飞机已报废");
    }
}
