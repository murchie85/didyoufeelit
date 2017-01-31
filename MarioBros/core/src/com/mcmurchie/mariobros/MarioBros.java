package com.mcmurchie.mariobros;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mcmurchie.mariobros.Screens.PlayScreen;

// this Game class 	is an applciation listener and delegates the rendering to a screen
//this allows the game to easily have multiple screens
// screens aren't disposed so we need to do that
// java.lang.object ---> com.badlogic.Game  (ApplicaitonListener interface)
public class MarioBros extends Game {
	public SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this)); // passes this screen itself
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
