package 面向对象实验二._03接口模拟主板PCI插槽;

// 4. 提供测试类，模拟测试各种功能卡的运行
public class Test {
    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard();

        PCICard soundCard = new SoundCard();
        PCICard networkCard = new NetworkCard();
        PCICard videoCard = new VideoCard();


        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                motherboard.insertPCICard(soundCard);
            } else if (i == 2) {
                motherboard.insertPCICard(videoCard);
            }else{
                motherboard.insertPCICard(networkCard);
            }
            motherboard.powerOn(); // 输出：声卡启动、网卡启动、显卡启动
            motherboard.powerOff(); // 输出：声卡停止、网卡停止、显卡停止
        }

    }
}
