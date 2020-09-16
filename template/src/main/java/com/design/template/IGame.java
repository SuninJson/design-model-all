package com.design.template;

public interface IGame {
    default void play() {
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

    void endPlay();

    void startPlay();

    void initialize();


}
