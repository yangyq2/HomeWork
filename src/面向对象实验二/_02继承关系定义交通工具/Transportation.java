package 面向对象实验二._02继承关系定义交通工具;

// 父类：交通工具
class Transportation {
    private final String name;

    public Transportation() {
        this.name = "交通工具";
    }

    public Transportation(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(this.name + "正在工作");
    }

    public void sound() {
        System.out.println(this.name + "发出声音");
    }

    public void scrap() {
        System.out.println(this.name + "已报废");
    }
}
