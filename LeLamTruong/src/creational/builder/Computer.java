/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 *
 * @author Administrator
 */
public class Computer {
    String cpu,memory,hd,screen;
    
    //de ben ngoai ko truy cap vao duoc
    private Computer(Builder builder) {
        this.cpu=builder.cpu;
        this.hd=builder.hd;
        this.memory= builder.memory;
        this.screen= builder.screen;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu=" + cpu + ", memory=" + memory + ", hd=" + hd + ", screen=" + screen + '}';
    }
    
    //lớp nội
    //phai co "new" de khoi tao, moi truy cap duoc vao
    public static class Builder{
         String cpu,memory,hd,screen;

        public Builder() {
        }

        public Builder addCPU(String cpu){
            this.cpu= cpu;
            return this;
        }
        public Builder addMemory(String memory){
            this.memory= memory;
            return this;
        }
        public Builder addHd(String hd){
            this.hd= hd;
            return this;
        }
        public Builder addScreen(String screen){
            this.screen= screen;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
