/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.duck;

/**
 *
 * @author Administrator
 */
public abstract class Duck {
    //khai bao giao dien
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    //seter hay con goi la ham khoi tao cac bien truoc khi dung
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    public abstract String display();
    String swim()
    {
        return "Swim";
    }
    String performFly()
    {
        return flyBehavior.fly();
    }
    String performQuack(){
        return quackBehavior.quack();
    }
     // ghi đè, để tạo ra 1 phương thức trả về tất cả các kết quả phương thức trên
    @Override
    public String toString() {
        return swim()+"\n"+
                performFly()+"\n"+
                performQuack()+"\n";
    }
    
}
