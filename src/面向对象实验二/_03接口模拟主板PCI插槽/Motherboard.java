package 面向对象实验二._03接口模拟主板PCI插槽;

// 3. 定义主板类及 PCI插卡方法
class Motherboard {
    private PCICard pciCard;

    public void insertPCICard(PCICard card) {
        this.pciCard = card;
    }

    public void removePCICard() {
        this.pciCard = null;
    }

    public void powerOn() {
        if (pciCard != null) {
            pciCard.start();
        } else {
            System.out.println("没有插入PCI插槽");
        }
    }

    public void powerOff() {
        if (pciCard != null) {
            pciCard.stop();
        } else {
            System.out.println("没有插入PCI插槽");
        }
    }
}
