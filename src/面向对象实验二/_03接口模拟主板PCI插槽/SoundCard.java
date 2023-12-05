package 面向对象实验二._03接口模拟主板PCI插槽;

// 2. 定义声卡、网卡、显卡等具体PCI功能卡接口实现类
class SoundCard implements PCICard {
    @Override
    public void start() {
        System.out.println("声卡启动");
    }

    @Override
    public void stop() {
        System.out.println("声卡停止");
    }
}
