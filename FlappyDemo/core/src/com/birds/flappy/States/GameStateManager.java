package com.birds.flappy.States;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Stack;

/**
 * Created by adammcmurchie on 11/01/2017.
 */

public class  GameStateManager {
    // FUCKING IMPORTANT <State> is just the class name. stack a class
    private Stack<State> states;

    public GameStateManager(){
        states = new Stack<State>();
    }

    // add methods to manage stacks


    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop();
    }

    //pop then push straight away
    public void set(State state){
        states.pop();
        states.push(state);

    }

    // peak looks at top state
    // updates the time between two renders

    public void update(float dt){
        states.peek().update(dt);
    }
    //sprite batch called sb
    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
