package chapter7;

/**
 * 太空船代理
 * <br>Created by 吴海南 on 2017/3/17.
 * <br>星期五 at 9:44.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls=new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    //代理方法 Java语言不直接支持代理
    //但是很多开发工具支持代理
    //下面的代理方法是JetBrains idea自动生成的

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector=new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
