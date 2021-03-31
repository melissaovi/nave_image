package gameObjects;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import math.Vector2D;

//no se crean objetos , de esta clase deriban los objetos del juego

public abstract class GameObject {
	protected BufferedImage texture;   //solo puede ser accedido por miembros de la misma clase
	protected Vector2D position;
	
	
	public GameObject(Vector2D position,BufferedImage texture) {
		this.position = position;
		this.texture = texture;
	}
	public abstract void update();
	
	
	public abstract void draw(Graphics g);
	
	
	public Vector2D getPosition() {
		return position;
	}
	public void setPosition(Vector2D position) {
		this.position = position;
	}
	
	
	
	
	
	
}
