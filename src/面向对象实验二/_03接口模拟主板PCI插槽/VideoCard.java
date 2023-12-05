package 面向对象实验二._03接口模拟主板PCI插槽;

class VideoCard implements PCICard {
    @Override
    public void start() {
        System.out.println("显卡启动");
    }

    @Override
    public void stop() {
        System.out.println("显卡停止");
    }
}
