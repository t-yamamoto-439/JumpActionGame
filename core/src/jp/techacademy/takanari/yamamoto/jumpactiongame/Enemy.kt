package jp.techacademy.takanari.yamamoto.jumpactiongame.jp.techacademy.takanari.yamamoto.jumpactiongame

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite


class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : Sprite(texture, srcX, srcY, srcWidth, srcHeight) {
    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH = 1.2f
        val ENEMY_HEIGHT = 1.2f

        // 状態
        val ENEMY_EXIST = 0
        val ENEMY_NONE = 1
    }

    var mState: Int = 0

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
        mState = ENEMY_EXIST
    }

    fun get() {
        mState = ENEMY_NONE
        setAlpha(0f)
    }
}