package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GamIntoTheWoods extends Game {
	SpriteBatch batch;
	Texture img;
	Image imgHero;
	Sprite sprHero;
	TextureAtlas taHero;
	TextureRegion trCurrentFrame, trLeft[], trRight[];
	Texture txCurrentFrame;
	Animation aniLeft, aniRight;
	float fStateTime;
	SpriteBatch spriteBatch;

	
	@Override
	public void create () {
		//batch = new SpriteBatch();
		///img = new Texture("badlogic.jpg");
		//setScreen(new ScrLaz(this));
		imgHero = new Image();
		sprHero = new Sprite();
		System.out.println("Actor made************************************************************************");
		taHero = new TextureAtlas("Heroinepacked.pack");
		trCurrentFrame = new TextureRegion();


		trLeft = new TextureRegion[3];
		trRight = new TextureRegion[3];
		for (int i = 0; i < 3; i++) {
			trLeft[i] = taHero.findRegion("Left" + (i + 1));
			trRight[i] = taHero.findRegion("Right" + (i + 1));
		}

		aniLeft = new Animation(0.15f, trLeft);
		//aniRight = new Animation(0.15f, trRight);
		trCurrentFrame = trRight[0];
		fStateTime = 0f;
		//bRight = true
		spriteBatch = new SpriteBatch();
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		fStateTime += Gdx.graphics.getDeltaTime();
		trCurrentFrame = aniLeft.getKeyFrame(fStateTime, true);
		spriteBatch.begin();
		spriteBatch.draw(trCurrentFrame, 50, 50);
		spriteBatch.end();
	}
}
