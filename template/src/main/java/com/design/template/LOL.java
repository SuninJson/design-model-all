package com.design.template;

public class LOL implements IGame {
    @Override
    public void endPlay() {
        System.out.println("Victory！");
    }

    @Override
    public void startPlay() {
        System.out.println("互甩技能，Biu Biu Biu");
    }

    @Override
    public void initialize() {
        System.out.println("初始化英雄联盟游戏，加载玩家信息");
    }

    public static void main(String[] args) {
        IGame lol = new LOL();
        lol.play();
    }
}
