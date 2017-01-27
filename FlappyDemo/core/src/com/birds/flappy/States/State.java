package com.birds.flappy.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by adammcmurchie on 11/01/2017.
 */

public abstract class State {

    protected OrthographicCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;


    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();

    }

    protected abstract void handleInput();
    public  abstract void update(float dt); // takes in DT difference beteen one frame rendered and next frame rendered
    public abstract void render(SpriteBatch ab); // Sprite batch container for everything to render
}
