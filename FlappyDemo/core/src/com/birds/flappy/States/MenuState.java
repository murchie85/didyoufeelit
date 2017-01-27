package com.birds.flappy.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.birds.flappy.FlappyDemo;

import static com.badlogic.gdx.Input.Keys.T;

/**
 * Created by adammcmurchie on 11/01/2017.
 */

public class MenuState extends State {//GENERATE ALL OVERIDE METHODS
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {

        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playBtn.png");

    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {

         sb.begin();
         sb.draw(background, 0,0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT); // background no need to use GET for whole screen
         sb.draw(playBtn, (FlappyDemo.WIDTH/2) - (playBtn.getWidth() /2), FlappyDemo.HEIGHT/2); // NEED GETWIDTH for playbutton
                            // halfway            to the left halfbtn
         sb.end();
    }
}
